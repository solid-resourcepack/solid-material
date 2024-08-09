package io.github.solid.resourcepack.material

import kotlin.Lazy
import kotlin.String
import kotlin.collections.List
import net.kyori.adventure.key.Key

public enum class SolidItemMaterialParent(
  public val key: Lazy<Key>,
  public val textureIds: Lazy<List<String>>,
) {
  GENERATED(lazy { Key.key("minecraft:item/generated") }, lazy { listOf("layer0") }),
  TEMPLATE_SPAWN_EGG(lazy { Key.key("minecraft:item/template_spawn_egg") }, lazy { listOf() }),
  HANDHELD(lazy { Key.key("minecraft:item/handheld") }, lazy { listOf("layer0") }),
  TEMPLATE_BANNER(lazy { Key.key("minecraft:item/template_banner") }, lazy { listOf() }),
  TEMPLATE_BED(lazy { Key.key("minecraft:item/template_bed") }, lazy { listOf("particle") }),
  TEMPLATE_SHULKER_BOX(lazy { Key.key("minecraft:item/template_shulker_box") }, lazy {
      listOf("particle") }),
  HANDHELD_ROD(lazy { Key.key("minecraft:item/handheld_rod") }, lazy { listOf("layer0") }),
  TEMPLATE_SKULL(lazy { Key.key("minecraft:item/template_skull") }, lazy { listOf() }),
  CHEST(lazy { Key.key("minecraft:item/chest") }, lazy { listOf() }),
  AMETHYST_BUD(lazy { Key.key("minecraft:item/amethyst_bud") }, lazy { listOf("layer0") }),
  HANDHELD_MACE(lazy { Key.key("minecraft:item/handheld_mace") }, lazy { listOf("layer0") }),
  TEMPLATE_MUSIC_DISC(lazy { Key.key("minecraft:item/template_music_disc") }, lazy {
      listOf("layer0") }),
  COPPER_BULB(lazy { Key.key("minecraft:item/copper_bulb") }, lazy { listOf() }),
  COPPER_DOOR(lazy { Key.key("minecraft:item/copper_door") }, lazy { listOf() }),
  COPPER_TRAPDOOR(lazy { Key.key("minecraft:item/copper_trapdoor") }, lazy { listOf() }),
  EXPOSED_COPPER_BULB(lazy { Key.key("minecraft:item/exposed_copper_bulb") }, lazy { listOf() }),
  EXPOSED_COPPER_DOOR(lazy { Key.key("minecraft:item/exposed_copper_door") }, lazy { listOf() }),
  EXPOSED_COPPER_TRAPDOOR(lazy { Key.key("minecraft:item/exposed_copper_trapdoor") }, lazy {
      listOf() }),
  OXIDIZED_COPPER_BULB(lazy { Key.key("minecraft:item/oxidized_copper_bulb") }, lazy { listOf() }),
  OXIDIZED_COPPER_DOOR(lazy { Key.key("minecraft:item/oxidized_copper_door") }, lazy { listOf() }),
  OXIDIZED_COPPER_TRAPDOOR(lazy { Key.key("minecraft:item/oxidized_copper_trapdoor") }, lazy {
      listOf() }),
  WEATHERED_COPPER_BULB(lazy { Key.key("minecraft:item/weathered_copper_bulb") }, lazy { listOf()
      }),
  WEATHERED_COPPER_DOOR(lazy { Key.key("minecraft:item/weathered_copper_door") }, lazy { listOf()
      }),
  WEATHERED_COPPER_TRAPDOOR(lazy { Key.key("minecraft:item/weathered_copper_trapdoor") }, lazy {
      listOf() }),
  ;

  public fun toGeneric(): SolidMaterialParent = SolidMaterialParent(key.value, textureIds.value)
}
