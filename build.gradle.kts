buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:7.0.4")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.6.0")
    }
}

plugins {
  id("org.sonarqube") version "3.3"
}

sonarqube {
  properties {
    property("sonar.projectKey", "flawedworld_GmsCompat")
    property("sonar.organization", "flawedworld")
    property("sonar.host.url", "https://sonarcloud.io")
  }
}

allprojects {
    tasks.withType<JavaCompile> {
        val compilerArgs = options.compilerArgs
        compilerArgs.add("-Xlint:unchecked")
        compilerArgs.add("-Xlint:deprecation")
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}

