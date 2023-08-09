plugins {
    id("java")
}

group = "br.com.iterasys"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.testng:testng:7.8.0")
    testImplementation("org.hamcrest:hamcrest:2.2")
    implementation("io.appium:java-client:8.5.1")

}

tasks.test {
    useTestNG()
}