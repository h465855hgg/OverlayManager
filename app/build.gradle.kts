plugins {
    alias(libs.plugins.android.application)
    // 删掉 kotlin.android，只保留 parcelize
    id("org.jetbrains.kotlin.plugin.parcelize")
}

android {
    namespace = "io.github.h465855hgg.overlay_manager"
    compileSdk {
        version = release(37) {

        }
    }

    defaultConfig {
        applicationId = "io.github.h465855hgg.overlay_manager"
        minSdk = 24
        //noinspection OldTargetApi
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            optimization {
                enable = false
            }
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    buildFeatures {
        viewBinding = true
        buildConfig = true  // ← 加上这一行！
        aidl = true
    }
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation(libs.kotlin.stdlib.jdk8)

    implementation(libs.androidx.cardview)
    implementation(libs.core)
    implementation(libs.service)
    implementation(libs.progresscircula)
    implementation(libs.picasso)
    implementation(libs.android.target.tooltip)
    implementation(libs.api)
    implementation(libs.provider)
    implementation(libs.hiddenapibypass)

    // 如果你要升级版本，顺手改一下
    implementation(libs.kotlinx.coroutines.core)
    implementation(libs.kotlinx.coroutines.android)

    implementation(libs.androidx.activity.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.core.ktx)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(libs.androidx.junit)
}