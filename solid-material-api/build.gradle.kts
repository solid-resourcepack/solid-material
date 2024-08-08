plugins {
    `maven-publish`
    alias(libs.plugins.sonatypeCentralPortalPublisher)
}

dependencies {
    compileOnly(libs.bundles.creative)
    compileOnly(libs.paper)
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            from(components["java"])
        }
    }
}


centralPortal {
    name = project.name

    username = project.findProperty("sonatypeUsername") as? String
    password = project.findProperty("sonatypePassword") as? String

    pom {
        name.set("Solid Material")
        description.set("A collection of auto generated enum classes for minecraft materials, holding important information for resource packs")
        url.set("https://github.com/solid-resourcepack/solid-material")

        developers {
            developer {
                id.set("dayyeeet")
                email.set("david@cappell.net")
            }
        }
        licenses {
            license {
                name.set("Apache-2.0")
                url.set("https://www.apache.org/licenses/LICENSE-2.0.txt")
            }
        }
        scm {
            url.set("https://github.com/solid-resourcepack/solid-material")
            connection.set("git:git@github.com:solid-resourcepack/solid-material.git")
        }
    }
}

signing {
    useGpgCmd()
    sign(publishing.publications)
}

