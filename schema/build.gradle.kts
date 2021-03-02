import com.netflix.graphql.dgs.codegen.gradle.GenerateJavaTask

plugins {

val kotlinVersion = "1.4.31"
    id("org.jetbrains.kotlin.jvm") // version kotlinVersion
    id("com.netflix.dgs.codegen") version "4.2.0"
}

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}

repositories {
    mavenCentral()
    jcenter()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation("com.netflix.graphql.dgs:graphql-dgs-spring-boot-starter:3.6.0")
}

tasks.generateJava {
    packageName = "shows.api"
    generateClient = true
}
