package io.github.solid.resourcepack.material

import kotlin.Lazy
import kotlin.String
import kotlin.collections.List
import net.kyori.adventure.key.Key

public enum class SolidBuiltinMaterialParent(
  public val key: Lazy<Key>,
  public val textureIds: Lazy<List<String>>,
) {
  ENTITY(lazy { Key.key("minecraft:builtin/entity") }, lazy { listOf("particle") }),
  ;

  public fun toGeneric(): SolidMaterialParent = SolidMaterialParent(key.value, textureIds.value)
}
