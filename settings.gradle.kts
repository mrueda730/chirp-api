pluginManagement {
    includeBuild("build-logic")
    repositories {
        gradlePluginPortal()
    }
}

rootProject.name = "chirp"
include("app")
include("user")
include("notification")
include("chat")
include("common")