buildscript {
    repositories {
        google()
        jcenter()
        maven {
            setUrl("https://maven.fabric.io/public")
        }
    }
    dependencies {
        classpath("com.android.tools.build:gradle:3.5.0")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion")
        classpath ("org.jetbrains.dokka:dokka-android-gradle-plugin:0.9.18")
    }
}

allprojects {
    repositories {
        google()
        jcenter()
    }
}

tasks.register("clean").configure {
    delete("build")
}