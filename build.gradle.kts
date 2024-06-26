plugins { id("java") }

group = "org.stellar"

version = "1.0-SNAPSHOT"

repositories { mavenCentral() }

dependencies {
  // add snakeyaml dependency
  implementation("org.yaml:snakeyaml:1.33")
  // add postgres
  implementation("org.postgresql:postgresql:42.7.1")
  // add json dependency
  implementation("org.json:json:20201115")
  // add snappy-java
  implementation("org.xerial.snappy:snappy-java:1.1.8.4")
  implementation("org.xerial:sqlite-jdbc:3.36.0.3")
  // add avro
  implementation("org.apache.avro:avro:1.10.1")

  testImplementation(platform("org.junit:junit-bom:5.10.0"))
  testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test { useJUnitPlatform() }
