package io.github.solid.resourcepack.material

import kotlin.Lazy
import net.kyori.adventure.key.Key

public enum class SolidModelsMaterialTexture(
  public val key: Lazy<Key>,
) {
  CHAINMAIL_LAYER_1(lazy { Key.key("minecraft:models/armor/chainmail_layer_1") }),
  CHAINMAIL_LAYER_2(lazy { Key.key("minecraft:models/armor/chainmail_layer_2") }),
  DIAMOND_LAYER_1(lazy { Key.key("minecraft:models/armor/diamond_layer_1") }),
  DIAMOND_LAYER_2(lazy { Key.key("minecraft:models/armor/diamond_layer_2") }),
  GOLD_LAYER_1(lazy { Key.key("minecraft:models/armor/gold_layer_1") }),
  GOLD_LAYER_2(lazy { Key.key("minecraft:models/armor/gold_layer_2") }),
  IRON_LAYER_1(lazy { Key.key("minecraft:models/armor/iron_layer_1") }),
  IRON_LAYER_2(lazy { Key.key("minecraft:models/armor/iron_layer_2") }),
  LEATHER_LAYER_1(lazy { Key.key("minecraft:models/armor/leather_layer_1") }),
  LEATHER_LAYER_1_OVERLAY(lazy { Key.key("minecraft:models/armor/leather_layer_1_overlay") }),
  LEATHER_LAYER_2(lazy { Key.key("minecraft:models/armor/leather_layer_2") }),
  LEATHER_LAYER_2_OVERLAY(lazy { Key.key("minecraft:models/armor/leather_layer_2_overlay") }),
  NETHERITE_LAYER_1(lazy { Key.key("minecraft:models/armor/netherite_layer_1") }),
  NETHERITE_LAYER_2(lazy { Key.key("minecraft:models/armor/netherite_layer_2") }),
  TURTLE_LAYER_1(lazy { Key.key("minecraft:models/armor/turtle_layer_1") }),
  ;

  public fun toGeneric(): SolidMaterialTexture = SolidMaterialTexture(key.value)
}
