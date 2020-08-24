buildscript {

    project.extra["kotlinVersion"] = "1.4.0"
    project.extra["agpVersion"] = "4.1.0-rc01"
    project.extra["brpVersion"] = "0.9.2"

    repositories {
        google()
        jcenter()
        mavenLocal()
    }

    dependencies {
        classpath(kotlin("gradle-plugin", version = project.extra["kotlinVersion"].toString()))
        classpath("com.android.tools.build:gradle:${project.extra["agpVersion"]}")
        classpath("com.novoda:bintray-release:${project.extra["brpVersion"]}")
    }

}

allprojects {
    repositories {
        google()
        jcenter()
        mavenLocal()
    }
}

task("clean") {
    delete(rootProject.buildDir)
}