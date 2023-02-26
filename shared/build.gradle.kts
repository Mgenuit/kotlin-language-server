plugins {
    id("maven-publish")
    kotlin("jvm") version "1.8.10"
}

repositories {
    mavenCentral()
}

version = project.version

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of("11"))
    }
}

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation("org.hamcrest:hamcrest-all:1.3")
    testImplementation("junit:junit:4.11")
}
