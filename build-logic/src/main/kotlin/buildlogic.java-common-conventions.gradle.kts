/*
 * This file was generated by the Gradle 'init' task.
 *
 * This project uses @Incubating APIs which are subject to change.
 */
val appVersion: String by project

plugins {
    // Apply the java Plugin to add support for Java.
    java
    id("io.spring.dependency-management")
}

subprojects {
    group = "org.cv"
    version = appVersion
}

repositories {
    // Use Maven Central for resolving dependencies.
    mavenLocal()
    mavenCentral()
    maven {
        url = uri("https://maven.pkg.github.com/o3o-vc/repository")
    }
}
dependencyManagement {
    applyMavenExclusions(false)
    imports {
        mavenBom(org.springframework.boot.gradle.plugin.SpringBootPlugin.BOM_COORDINATES)
    }
}

dependencies {
    constraints {
        // Define dependency versions as constraints
        implementation("com.ibeetl:sql-springboot-starter:3.30.9-RELEASE")
        implementation("mysql:mysql-connector-java:8.0.33")
        implementation("com.ibeetl:sql-core:3.30.9-RELEASE")
        implementation("com.one-zero:one-zero-core:1.0.1")
        implementation("cn.dev33:sa-token-spring-boot3-starter:1.38.0")
        implementation("com.aizuda:snail-job-client-starter:1.1.0")
        implementation("com.aizuda:snail-job-client-retry-core:1.1.0")
        implementation("com.aizuda:snail-job-client-job-core:1.1.0")
        implementation("cn.hutool:hutool-core:5.8.29")

    }
    compileOnly("org.projectlombok:lombok:1.18.34")
    annotationProcessor("org.projectlombok:lombok:1.18.34")
    implementation("org.springframework.boot:spring-boot-starter-log4j2")
    implementation("com.fasterxml.jackson.dataformat:jackson-dataformat-yaml")
}

configurations {
    all {
        exclude(group = "org.springframework.boot", module = "spring-boot-starter-logging")
    }
}

testing {
    suites {
        // Configure the built-in test suite
        val test by getting(JvmTestSuite::class) {
            // Use JUnit Jupiter test framework
            useJUnitJupiter("5.10.2")
        }
    }
}

// Apply a specific Java toolchain to ease working on different environments.
java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}
