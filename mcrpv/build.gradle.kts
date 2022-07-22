plugins {
    val kotlinVersion = "1.7.10"
    kotlin("jvm") version kotlinVersion
    kotlin("plugin.serialization") version kotlinVersion

    id("net.mamoe.mirai-console") version "2.12.0"
}
dependencies{
    //coreroutine
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.3")
    //date_get
    implementation("org.jetbrains.kotlinx:kotlinx-datetime:0.4.0")
    implementation(npm("@js-joda/timezone", "2.3.0"))
    //log
    implementation("org.slf4j:slf4j-api:1.7.36")
    implementation("org.slf4j:slf4j-simple:1.7.36")
    implementation("io.github.microutils:kotlin-logging-jvm:2.1.23")
    //org.json
    implementation("org.json:json:20220320")
    //sql
    implementation("org.ktorm:ktorm-core:3.5.0")
}
group = "com.greenhandzdl"
version = "0.0.1"

repositories {
    maven("https://maven.aliyun.com/repository/public")
    mavenCentral()
}
