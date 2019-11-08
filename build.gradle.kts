plugins {
    java
}

java {
    sourceSets {
        named<SourceSet>("main") {
            java.setSrcDirs(listOf("src"))
            resources.setSrcDirs(listOf("resources"))
        }
        named<SourceSet>("test") {
            java.setSrcDirs(listOf("tests/src"))
        }
    }

}

val vaadinVersion = "8.9.2"

repositories {
    jcenter()
}

dependencies {
    compile("com.vaadin:vaadin-server:$vaadinVersion")
    compile("com.vaadin:vaadin-client:$vaadinVersion")
    compile("com.vaadin:vaadin-themes:$vaadinVersion")
    testCompile("junit:junit:4.12")
    testCompile("org.mockito:mockito-core:2.28.2")
}

tasks {
    compileJava {
        sourceCompatibility = "1.8"
        targetCompatibility = "1.8"
    }
}