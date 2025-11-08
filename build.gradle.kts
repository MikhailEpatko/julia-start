import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "2.0.21"
    id("io.gitlab.arturbosch.detekt") version "1.23.8"
    id("org.jlleitschuh.gradle.ktlint") version "13.1.0"
}

detekt {
    source.setFrom("src/main/kotlin")
    config.setFrom("detekt/config.yml")
    buildUponDefaultConfig = false
    parallel = true
    basePath = projectDir.path
}

ktlint {
    android = false
    ignoreFailures = false
}

group = "ru.julia.start"
version = "0.0.0"

repositories {
    mavenCentral()
    gradlePluginPortal()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

tasks.detekt {
    dependsOn(tasks.ktlintCheck)
}

tasks.withType<KotlinCompile> {
    compilerOptions {
        freeCompilerArgs.set(listOf("-Xjsr305=strict"))
        jvmTarget.set(JvmTarget.JVM_21)
    }
}