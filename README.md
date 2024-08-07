# solid-material ![Maven Central Version](https://img.shields.io/maven-central/v/io.github.solid-resourcepack/solid-material-api?style=flat) ![CodeFactor Grade](https://img.shields.io/codefactor/grade/github/solid-resourcepack/solid-material)
A collection of auto generated enum classes for minecraft materials, holding important information for resource packs.
This repository aims to provide a simple way to access material information for resource packs. It is generated from the official minecraft data files and provides a simple way to access the information.

The API is designed to be used in combination with the [solid-api](https://github.com/solid-resourcepack/solid-api) project.

You can however access resource pack information without the solid-api project, by using the generated enum classes [directly](#usage).

## Dependency

### Gradle Kotlin
```kt
implementation("io.github.solid-resourcepack:solid-material-api:VERSION")
```
### Gradle Groovy
```groovy
implementation 'io.github.solid-resourcepack:solid-material-api:VERSION'
```

### Maven
```xml
<dependency>
    <groupId>io.github.solid-resourcepack</groupId>
    <artifactId>solid-material-api</artifactId>
    <version>VERSION</version>
</dependency>
```

## Usage

### Block Materials
```kotlin
val material = SolidBlockMaterial.STONE.toGeneric()
```

### Item Materials
```kotlin
val material = SolidBlockMaterial.STICK.toGeneric()
```

### Material properties
```kotlin
material.parent // The resourcepack parent key of the material (e.g. "minecraft:item/generated")
material.key // The resourcepack key of the material (e.g. "minecraft:item/stick")
material.textures // A list of all textures used by the material
```


## Contributing
To contribute to this project
1. Check if your feature is not already provided in a pull request or the project,
2. if it is not, [fork](https://github.com/solid-resourcepack/solid-material/fork) the repository,
3. commit changes into the fork,
4. open a pull request with the [development branch](https://github.com/solid-resourcepack/solid-material/tree/development) as base

## License
This project is [licensed](LICENSE) under the Apache-2.0 license.
