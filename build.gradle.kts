plugins {
    id("java")
}

group = "org.stellar"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    // add snakeyaml dependency
    implementation("org.yaml:snakeyaml:1.33")
    // add postgres
    implementation("org.postgresql:postgresql:42.7.3")
    // add json dependency
    implementation("org.json:json:20201115 ")

    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}