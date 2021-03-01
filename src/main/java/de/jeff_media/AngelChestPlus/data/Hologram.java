package de.jeff_media.AngelChestPlus.data;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

import de.jeff_media.AngelChestPlus.Main;
import de.jeff_media.AngelChestPlus.config.Config;
import de.jeff_media.AngelChestPlus.utils.CommandUtils;
import me.clip.placeholderapi.PlaceholderAPI;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.util.Vector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Represents a complete AngelChest hologram
 */
public class Hologram {

    public final ArrayList<UUID> armorStandUUIDs;
    public final String text;
    final double lineOffset;
    private final Main main;
    boolean usePapi = false;

    /**
     * Updates the hologram. Called once per second
     * @param chest AngelChest this hologram belongs to
     */
    public void update(AngelChest chest) {

        Scanner scanner = new Scanner(text);
        int lineNumber = 0;
        while (scanner.hasNextLine()) {

            ArmorStand armorStand = getArmorStandByLineNumber(lineNumber);
			String line = scanner.nextLine();
            if (armorStand != null) {

                line = line.replaceAll("\\{time}", CommandUtils.getTimeLeft(chest));
                if (line.equals("")) {
                    armorStand.setCustomName(" ");
                    armorStand.setCustomNameVisible(false);
                } else {
                    armorStand.setCustomNameVisible(true);
                }

                if (usePapi) {
                    line = PlaceholderAPI.setPlaceholders(Bukkit.getOfflinePlayer(chest.owner), line);
                }

                armorStand.setCustomName(line);
                //System.out.println("updated hologram "+armorStands.get(lineNumber).getUniqueId()+" "+ line);
            }

            lineNumber++;
        }
    }

    /**
     * Creates a hologram with one or more lines
     * @param block Block where the hologram should be spawned
     * @param text The hologram text, lines separated by "\n"
     * @param chest AngelChest this hologram belongs to
     */
    public Hologram(Block block, String text, AngelChest chest) {
        this.main=Main.getInstance();
        int totalLineNumbers = text.split("\n").length;
        lineOffset = main.getConfig().getDouble(Config.HOLOGRAM_OFFSET_PER_LINE);
        Location location = block.getLocation()
                .add(new Vector(0.5, -1.3 + main.getConfig().getDouble(Config.HOLOGRAM_OFFSET), 0.5))
                .add(new Vector(0,lineOffset * totalLineNumbers,0));

        if (Bukkit.getPluginManager().getPlugin("PlaceholderAPI") != null) {
            usePapi = true;
        }

        main.debug("Creating hologram with text " + text + " at " + location.toString());
        this.text = text;

        armorStandUUIDs = new ArrayList<>();
        int lineNumber = 0;

        Scanner scanner = new Scanner(text);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            line = line.replaceAll("\\{time}", CommandUtils.getTimeLeft(chest));
            boolean customNameVisible = true;
            if (line.equals("")) {
                line = " ";
                customNameVisible = false;
            }

            ArmorStand as = (ArmorStand) location.getWorld().spawnEntity(location.clone().add(new Vector(0, -lineOffset*lineNumber, 0)), EntityType.ARMOR_STAND); // Spawn the ArmorStand
            armorStandUUIDs.add(as.getUniqueId());

            as.setGravity(false);
            as.setCanPickupItems(false);
            as.setCustomName(line);
            as.setCustomNameVisible(customNameVisible);
            as.setVisible(false);

            lineNumber++;
        }
        scanner.close();
        main.watchdog.save();
    }

    /**
     * Destroys all armor stands belonging to this hologram
     */
    public void destroy() {
        for (ArmorStand armorStand : getArmorStands()) {
            if (armorStand != null) armorStand.remove();

            armorStandUUIDs.remove(armorStand.getUniqueId());
        }
        main.watchdog.save();
    }

    /**
     * Returns the armor stand that belongs to a specific line number
     * @param line line number, starting with 0
     * @return armor stand belonging to line number, null if it doesnt exist
     */
    public @Nullable ArmorStand getArmorStandByLineNumber(int line) {
        if (armorStandUUIDs.size() <= line) return null;
        return (ArmorStand) Bukkit.getEntity(armorStandUUIDs.get(line));
    }

    /**
     * Returns a list of all ArmorStands
     * @return list of all ArmorStands
     */
    public @NotNull List<ArmorStand> getArmorStands() {
        ArrayList<ArmorStand> armorStands = new ArrayList<>();
        for (UUID uuid : armorStandUUIDs) {
            Entity entity = Bukkit.getEntity(uuid);
            if (entity instanceof ArmorStand) {
                armorStands.add((ArmorStand) entity);
            }
        }
        return armorStands;
    }

}