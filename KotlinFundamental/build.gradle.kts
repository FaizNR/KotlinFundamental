plugins {
    java
    kotlin("jvm") version "1.3.72"
}

group = "com.Stematel.FaizNR"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    testCompile("junit", "junit", "4.12")
}
