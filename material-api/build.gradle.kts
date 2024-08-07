plugins {
    `maven-publish`
}

dependencies {
    compileOnly(libs.bundles.creative)
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            from(components["java"])
        }
    }
}