package io.github.solid.resourcepack.material

import net.kyori.adventure.key.Key

data class SolidMaterial(
    val key: Key,
    val parent: Key?,
    val textures: Map<String, Key>
)
