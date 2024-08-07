repositories {
    maven("https://papermc.io/repo/repository/maven-public/")
}

plugins {
    application
}

application {
    mainClass.set("io.github.solid.resourcepack.generator.SolidMaterialGeneratorKt")
}

dependencies {
    implementation(libs.kotlinPoet)
    implementation(libs.paper)
    implementation(libs.bundles.creative)
    implementation(project(":solid-material-api"))
}