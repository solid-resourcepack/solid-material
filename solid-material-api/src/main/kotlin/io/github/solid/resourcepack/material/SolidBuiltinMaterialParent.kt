package io.github.solid.resourcepack.material

import kotlin.Lazy
import net.kyori.adventure.key.Key

public enum class SolidBuiltinMaterialParent(
  public val key: Lazy<Key>,
) {
  ENTITY(lazy { Key.key("minecraft:builtin/entity") }),
  ;

  public fun toGeneric(): SolidMaterialParent = SolidMaterialParent(key.value)
}
