plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.5.0"
}
rootProject.name = "SpartaKotlin"
include("src:main:Project")
findProject(":src:main:Project")?.name = "Project"
