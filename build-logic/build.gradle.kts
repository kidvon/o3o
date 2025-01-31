/*
 * This file was generated by the Gradle 'init' task.
 *
 * This project uses @Incubating APIs which are subject to change.
 */

plugins {
    // Support convention plugins written in Kotlin. Convention plugins are build scripts in 'src/main' that automatically become available as plugins in the main build.
    `kotlin-dsl`
}

repositories {
    // Use the plugin portal to apply community plugins in convention plugins.
    gradlePluginPortal()
}
dependencies {
    implementation("io.spring.gradle:dependency-management-plugin:1.1.5")
    implementation("org.springframework.boot:spring-boot-gradle-plugin:3.3.1") {
        exclude(group = "com.fasterxml.jackson.core")
        exclude(group = "com.fasterxml.jackson.module")
        exclude(group = "org.antlr")
        exclude(group = "org.slf4j")
    }
}
