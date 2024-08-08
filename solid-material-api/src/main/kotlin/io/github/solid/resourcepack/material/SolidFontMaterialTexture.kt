package io.github.solid.resourcepack.material

import kotlin.Lazy
import net.kyori.adventure.key.Key

public enum class SolidFontMaterialTexture(
  public val key: Lazy<Key>,
) {
  ACCENTED(lazy { Key.key("minecraft:font/accented") }),
  ASCII(lazy { Key.key("minecraft:font/ascii") }),
  ASCIILLAGER(lazy { Key.key("minecraft:font/asciillager") }),
  ASCII_SGA(lazy { Key.key("minecraft:font/ascii_sga") }),
  NONLATIN_EUROPEAN(lazy { Key.key("minecraft:font/nonlatin_european") }),
  ;

  public fun toGeneric(): SolidMaterialTexture = SolidMaterialTexture(key.value)
}
