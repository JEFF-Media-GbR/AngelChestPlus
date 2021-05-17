package de.jeff_media.angelchest.config;

/**
 * Key names to use for the global config.yml
 */
public final class Config {

    public static final String ALIAS_ACFETCH = "command-aliases-acfetch";
    public static final String ALIAS_ACGUI = "command-aliases-acgui";
    public static final String ALIAS_ACLIST = "command-aliases-aclist";
    public static final String ALIAS_ACRELOAD = "command-aliases-acreload";
    public static final String ALIAS_ACTP = "command-aliases-actp";
    public static final String ALIAS_ACUNLOCK = "command-aliases-acunlock";
    public static final String ALLOW_ANGELCHEST_IN_PVP = "allow-angelchest-in-pvp";
    public static final String ALLOW_CHEST_IN_LAVA = "allow-chest-in-lava";
    public static final String ALLOW_CHEST_IN_VOID = "allow-chest-in-void";
    public static final String ANGELCHEST_DURATION = "angelchest-duration";
    public static final String ANGELCHEST_INVENTORY_NAME = "angelchest-inventory-name";
    public static final String ANGELCHEST_LIST = "angelchest-list";
    public static final String ASYNC_CHUNK_LOADING = "async-chunk-loading";
    public static final String AUTO_RESPAWN = "auto-respawn";
    public static final String AUTO_RESPAWN_DELAY = "auto-respawn-delay";
    public static final String CHECK_FOR_UPDATES = "check-for-updates";
    public static final String CHECK_FOR_UPDATES_INTERVAL = "check-interval";
    public static final String CHECK_GENERIC_SOULBOUND = "check-generic-soulbound";
    public static final String CHEST_FILENAME = "chest-filename";
    public static final String COLLECT_XP = "collect-xp";
    public static final String CONFIG_PLUGIN_VERSION = "plugin-version";
    public static final String CONFIG_VERSION = "config-version";
    public static final String CONFIRM = "confirm";
    public static final String CONSOLE_MESSAGE_ON_OPEN = "console-message-on-open";
    public static final String CUSTOM_HEAD_BASE64 = "custom-head-base64";
    public static final String DEBUG = "debug";
    public static final String DISABLED_MATERIALS = "disabled-materials";
    public static final String DISABLED_WORLDGUARD_REGIONS = "disabled-worldguard-regions";
    public static final String DISABLED_WORLDS = "disabled-worlds";
    public static final String DISABLE_WORLDGUARD_INTEGRATION = "disable-worldguard-integration";
    public static final String DONT_PROTECT_CHEST_IF_PLAYER_DIED_IN_PVP = "dont-protect-chest-if-player-died-in-pvp";
    public static final String DONT_SPAWN_ON = "dont-spawn-on";
    public static final String DONT_STORE_HEADS_IN_ANGELCHEST = "dont-store-heads-in-angelchest";
    public static final String DROP_HEADS = "drop-heads";
    //public static final String DETECT_PLAYER_HEAD_DROPS = "detect-player-head-drops";
    public static final String EVENT_PRIORITY = "event-priority";
    public static final String FLAG_ALLOW_ANGELCHEST_DEFAULT_VALUE = "flag-allow-angelchest-default-value";
    public static final String GUI_BUTTON_BACK = "gui-button-back";
    public static final String GUI_BUTTON_CONFIRM_ACCEPT = "gui-button-confirm-accept";
    public static final String GUI_BUTTON_CONFIRM_DECLINE = "gui-button-confirm-decline";
    public static final String GUI_BUTTON_CONFIRM_INFO = "gui-button-confirm-info";
    public static final String GUI_BUTTON_FETCH = "gui-button-fetch";
    public static final String GUI_BUTTON_INFO = "gui-button-info";
    public static final String GUI_BUTTON_PREVIEW = "gui-button-preview";
    public static final String GUI_BUTTON_PREVIEW_PLACEHOLDER = "gui-button-preview-placeholder";
    public static final String GUI_BUTTON_TELEPORT = "gui-button-teleport";
    public static final String GUI_BUTTON_UNLOCK = "gui-button-unlock";
    public static final String GUI_TITLE_CHEST = "gui-title-chest";
    public static final String GUI_TITLE_MAIN = "gui-title-main";
    public static final String HEAD_USES_PLAYER_NAME = "head-uses-player-name";
    public static final String HOLOGRAM_OFFSET = "hologram-offset";
    public static final String HOLOGRAM_OFFSET_PER_LINE = "hologram-offset-per-line";
    public static final String HOLOGRAM_PROTECTED_COUNTDOWN_TEXT = "hologram-protected-countdown-text";
    public static final String HOLOGRAM_PROTECTED_TEXT = "hologram-protected-text";
    public static final String HOLOGRAM_TEXT = "hologram-text";
    public static final String HOLOGRAM_UNPROTECTED_TEXT = "hologram-unprotected-text";
    public static final String IGNORE_KEEP_INVENTORY = "ignore-keep-inventory";
    public static final String INVULNERABILITY_AFTER_TP = "invulnerability-after-tp";
    public static final String ITEM_LOSS = "random-item-loss";
    //public static final String LINK_UNLOCK_FOR = "link-unlock-for";
    public static final String LINK_FETCH = "link-fetch";
    public static final String LINK_TELEPORT = "link-teleport";
    public static final String LINK_UNLOCK = "link-unlock";
    public static final String LOG_ANGELCHESTS = "log-angelchests";
    public static final String LOG_FILENAME = "log-filename";
    public static final String MATERIAL = "material";
    public static final String MATERIAL_UNLOCKED = "material-unlocked";
    public static final String MAX_ALLOWED_ANGELCHESTS = "max-allowed-angelchests";
    public static final String MAX_RADIUS = "max-radius";
    public static final String NEVER_REPLACE_BEDROCK = "never-replace-bedrock";
    public static final String ONLY_DROP_HEADS_IN_PVP = "only-drop-heads-in-pvp";
    public static final String ONLY_SHOW_GUI_AFTER_DEATH_IF_PLAYER_CAN_TP_OR_FETCH = "only-show-gui-after-death-if-player-can-tp-or-fetch";
    public static final String ONLY_SPAWN_CHESTS_IF_PLAYER_MAY_BUILD = "only-spawn-chests-if-player-may-build";
    public static final String ONLY_SPAWN_IN = "only-spawn-in";
    public static final String PLAY_TOTEM_ANIMATION = "play-totem-animation";
    public static final String PREFIX = "prefix";
    public static final String PREFIX_MESSAGES = "add-prefix";
    public static final String PRICE = "price";
    public static final String PRICE_FETCH = "price-fetch";
    public static final String PRICE_SUMMON = "price-right-click-summon";
    public static final String PRICE_OPEN = "price-open";
    public static final String PRICE_TELEPORT = "price-teleport";
    public static final String PURGE_LOGS_EVERY_X_HOURS = "purge-logs-every-x-hours";
    public static final String PURGE_LOGS_OLDER_THAN_X_HOURS = "purge-logs-older-than-x-hours";
    public static final String REFUND_EXPIRED_CHESTS = "refund-expired-chests";
    public static final String REMOVE_CURSE_OF_BINDING = "remove-curse-of-binding";
    public static final String REMOVE_CURSE_OF_VANISHING = "remove-curse-of-vanishing";
    public static final String SHOW_GUI_AFTER_DEATH = "show-gui-after-death";
    public static final String SHOW_LINKS_ON_SEPARATE_LINE = "show-links-on-separate-line";
    public static final String SHOW_LOCATION = "show-location";
    public static final String SHOW_LOCATION_ON_JOIN = "show-location-on-join";
    public static final String SHOW_MESSAGE_WHEN_OTHER_PLAYER_EMPTIES_CHEST = "show-message-when-other-player-empties-angelchest";
    public static final String SHOW_MESSAGE_WHEN_OTHER_PLAYER_OPENS_CHEST = "show-message-when-other-player-opens-angelchest";
    public static final String SPAWN_CHANCE = "spawn-chance";
    public static final String TOTEM_OF_UNDYING_WORKS_EVERYWHERE = "totem-of-undying-works-everywhere";
    public static final String UNLOCK_DURATION = "unlock-duration";
    public static final String USE_DIFFERENT_MATERIAL_WHEN_UNLOCKED = "use-different-material-when-unlocked";
    public static final String USE_EXECUTABLEITEMS = "use-executableitems";
    public static final String USE_SLIMEFUN = "use-slimefun";
    public static final String VERBOSE = "verbose";
    public static final String VOID_DETECTION = "void-detection";
    public static final String XP_PERCENTAGE = "xp-percentage";
    public static final String ALLOW_TP_ACROSS_WORLDS = "allow-tp-across-worlds";
    public static final String ALLOW_FETCH_ACROSS_WORLDS = "allow-fetch-across-worlds";
    public static final String MAX_TP_DISTANCE = "max-tp-distance";
    public static final String MAX_FETCH_DISTANCE = "max-fetch-distance";
    public static final String EXEMPT_ELITEMOBS_SOULBOUND_ITEMS_FROM_GENERIC_SOULBOUND_DETECTION = "exempt-elitemobs-soulbound-items-from-generic-soulbound-detection";
    public static final String USING_ACTOGGLE_BREAKS_EXISTING_CHESTS = "using-actoggle-breaks-existing-chests";
    public static final String MIN_DISTANCE = "min-distance";
    public static final String PLAY_SOUND_ON_TP = "play-sound-on-tp";
    public static final String PLAY_SOUND_ON_FETCH = "play-sound-on-fetch";
    public static final String SOUND_EFFECT = "sound-effect";
    public static final String SOUND_VOLUME = "sound-volume";
    public static final String SOUND_PITCH = "sound-pitch";
    public static final String SOUND_CHANNEL = "sound-channel";
    public static final String LAVA_DETECTION = "lava-detection";
    public static final String MINIMUM_AIR_ABOVE_CHEST = "minimum-air-above-chest";
    public static final String SUMMON_BLOCK = "block-to-right-click";
    public static final String SACRIFICE_ITEM = "item-to-sacrifice";
    public static final String SUMMON_ENABLED = "summon-on-right-click-block";
}
