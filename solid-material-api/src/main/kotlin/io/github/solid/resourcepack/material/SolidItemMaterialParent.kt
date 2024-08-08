package io.github.solid.resourcepack.material

import kotlin.Lazy
import net.kyori.adventure.key.Key

public enum class SolidItemMaterialParent(
  public val key: Lazy<Key>,
) {
  GENERATED(lazy { Key.key("minecraft:item/generated") }),
  TEMPLATE_SPAWN_EGG(lazy { Key.key("minecraft:item/template_spawn_egg") }),
  HANDHELD(lazy { Key.key("minecraft:item/handheld") }),
  TEMPLATE_BANNER(lazy { Key.key("minecraft:item/template_banner") }),
  TEMPLATE_BED(lazy { Key.key("minecraft:item/template_bed") }),
  TEMPLATE_SHULKER_BOX(lazy { Key.key("minecraft:item/template_shulker_box") }),
  HANDHELD_ROD(lazy { Key.key("minecraft:item/handheld_rod") }),
  TEMPLATE_SKULL(lazy { Key.key("minecraft:item/template_skull") }),
  CHEST(lazy { Key.key("minecraft:item/chest") }),
  AMETHYST_BUD(lazy { Key.key("minecraft:item/amethyst_bud") }),
  HANDHELD_MACE(lazy { Key.key("minecraft:item/handheld_mace") }),
  TEMPLATE_MUSIC_DISC(lazy { Key.key("minecraft:item/template_music_disc") }),
  COPPER_BULB(lazy { Key.key("minecraft:item/copper_bulb") }),
  COPPER_DOOR(lazy { Key.key("minecraft:item/copper_door") }),
  COPPER_TRAPDOOR(lazy { Key.key("minecraft:item/copper_trapdoor") }),
  EXPOSED_COPPER_BULB(lazy { Key.key("minecraft:item/exposed_copper_bulb") }),
  EXPOSED_COPPER_DOOR(lazy { Key.key("minecraft:item/exposed_copper_door") }),
  EXPOSED_COPPER_TRAPDOOR(lazy { Key.key("minecraft:item/exposed_copper_trapdoor") }),
  OXIDIZED_COPPER_BULB(lazy { Key.key("minecraft:item/oxidized_copper_bulb") }),
  OXIDIZED_COPPER_DOOR(lazy { Key.key("minecraft:item/oxidized_copper_door") }),
  OXIDIZED_COPPER_TRAPDOOR(lazy { Key.key("minecraft:item/oxidized_copper_trapdoor") }),
  WEATHERED_COPPER_BULB(lazy { Key.key("minecraft:item/weathered_copper_bulb") }),
  WEATHERED_COPPER_DOOR(lazy { Key.key("minecraft:item/weathered_copper_door") }),
  WEATHERED_COPPER_TRAPDOOR(lazy { Key.key("minecraft:item/weathered_copper_trapdoor") }),
  ;

  public fun toGeneric(): SolidMaterialParent = SolidMaterialParent(key.value)
}
