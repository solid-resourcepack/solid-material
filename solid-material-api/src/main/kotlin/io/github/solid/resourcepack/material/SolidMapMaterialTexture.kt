package io.github.solid.resourcepack.material

import kotlin.Lazy
import net.kyori.adventure.key.Key

public enum class SolidMapMaterialTexture(
  public val key: Lazy<Key>,
) {
  MAP_BACKGROUND(lazy { Key.key("minecraft:map/map_background") }),
  MAP_BACKGROUND_CHECKERBOARD(lazy { Key.key("minecraft:map/map_background_checkerboard") }),
  BLACK_BANNER(lazy { Key.key("minecraft:map/decorations/black_banner") }),
  BLUE_BANNER(lazy { Key.key("minecraft:map/decorations/blue_banner") }),
  BLUE_MARKER(lazy { Key.key("minecraft:map/decorations/blue_marker") }),
  BROWN_BANNER(lazy { Key.key("minecraft:map/decorations/brown_banner") }),
  CYAN_BANNER(lazy { Key.key("minecraft:map/decorations/cyan_banner") }),
  DESERT_VILLAGE(lazy { Key.key("minecraft:map/decorations/desert_village") }),
  FRAME(lazy { Key.key("minecraft:map/decorations/frame") }),
  GRAY_BANNER(lazy { Key.key("minecraft:map/decorations/gray_banner") }),
  GREEN_BANNER(lazy { Key.key("minecraft:map/decorations/green_banner") }),
  JUNGLE_TEMPLE(lazy { Key.key("minecraft:map/decorations/jungle_temple") }),
  LIGHT_BLUE_BANNER(lazy { Key.key("minecraft:map/decorations/light_blue_banner") }),
  LIGHT_GRAY_BANNER(lazy { Key.key("minecraft:map/decorations/light_gray_banner") }),
  LIME_BANNER(lazy { Key.key("minecraft:map/decorations/lime_banner") }),
  MAGENTA_BANNER(lazy { Key.key("minecraft:map/decorations/magenta_banner") }),
  OCEAN_MONUMENT(lazy { Key.key("minecraft:map/decorations/ocean_monument") }),
  ORANGE_BANNER(lazy { Key.key("minecraft:map/decorations/orange_banner") }),
  PINK_BANNER(lazy { Key.key("minecraft:map/decorations/pink_banner") }),
  PLAINS_VILLAGE(lazy { Key.key("minecraft:map/decorations/plains_village") }),
  PLAYER(lazy { Key.key("minecraft:map/decorations/player") }),
  PLAYER_OFF_LIMITS(lazy { Key.key("minecraft:map/decorations/player_off_limits") }),
  PLAYER_OFF_MAP(lazy { Key.key("minecraft:map/decorations/player_off_map") }),
  PURPLE_BANNER(lazy { Key.key("minecraft:map/decorations/purple_banner") }),
  RED_BANNER(lazy { Key.key("minecraft:map/decorations/red_banner") }),
  RED_MARKER(lazy { Key.key("minecraft:map/decorations/red_marker") }),
  RED_X(lazy { Key.key("minecraft:map/decorations/red_x") }),
  SAVANNA_VILLAGE(lazy { Key.key("minecraft:map/decorations/savanna_village") }),
  SNOWY_VILLAGE(lazy { Key.key("minecraft:map/decorations/snowy_village") }),
  SWAMP_HUT(lazy { Key.key("minecraft:map/decorations/swamp_hut") }),
  TAIGA_VILLAGE(lazy { Key.key("minecraft:map/decorations/taiga_village") }),
  TARGET_POINT(lazy { Key.key("minecraft:map/decorations/target_point") }),
  TARGET_X(lazy { Key.key("minecraft:map/decorations/target_x") }),
  TRIAL_CHAMBERS(lazy { Key.key("minecraft:map/decorations/trial_chambers") }),
  WHITE_BANNER(lazy { Key.key("minecraft:map/decorations/white_banner") }),
  WOODLAND_MANSION(lazy { Key.key("minecraft:map/decorations/woodland_mansion") }),
  YELLOW_BANNER(lazy { Key.key("minecraft:map/decorations/yellow_banner") }),
  ;

  public fun toGeneric(): SolidMaterialTexture = SolidMaterialTexture(key.value)
}
