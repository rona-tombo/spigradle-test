plugins {
    kotlin("jvm") version "1.5.31"
    id("kr.entree.spigradle") version "2.2.4"
}

group = "io.github.rona-tombo"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
}
