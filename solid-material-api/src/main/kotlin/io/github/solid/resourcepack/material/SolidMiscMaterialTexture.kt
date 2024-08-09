package io.github.solid.resourcepack.material

import kotlin.Lazy
import net.kyori.adventure.key.Key

public enum class SolidMiscMaterialTexture(
  public val key: Lazy<Key>,
) {
  CREDITS_VIGNETTE(lazy { Key.key("minecraft:misc/credits_vignette") }),
  PUMPKINBLUR(lazy { Key.key("minecraft:misc/pumpkinblur") }),
  SHADOW(lazy { Key.key("minecraft:misc/shadow") }),
  VIGNETTE(lazy { Key.key("minecraft:misc/vignette") }),
  ENCHANTED_GLINT_ENTITY(lazy { Key.key("minecraft:misc/enchanted_glint_entity") }),
  ENCHANTED_GLINT_ITEM(lazy { Key.key("minecraft:misc/enchanted_glint_item") }),
  FORCEFIELD(lazy { Key.key("minecraft:misc/forcefield") }),
  NAUSEA(lazy { Key.key("minecraft:misc/nausea") }),
  POWDER_SNOW_OUTLINE(lazy { Key.key("minecraft:misc/powder_snow_outline") }),
  SPYGLASS_SCOPE(lazy { Key.key("minecraft:misc/spyglass_scope") }),
  UNDERWATER(lazy { Key.key("minecraft:misc/underwater") }),
  UNKNOWN_PACK(lazy { Key.key("minecraft:misc/unknown_pack") }),
  UNKNOWN_SERVER(lazy { Key.key("minecraft:misc/unknown_server") }),
  WHITE(lazy { Key.key("minecraft:misc/white") }),
  ;

  public fun toGeneric(): SolidMaterialTexture = SolidMaterialTexture(key.value)
}
