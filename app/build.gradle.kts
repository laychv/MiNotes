plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
}

android {
    namespace = "net.micode.notes"
    compileSdk = 34

    defaultConfig {
        applicationId = "net.micode.notes"
        minSdk = 23
        targetSdk = 34
        versionCode = 1
        versionName = "1.0.0"

        useLibrary("org.apache.http.legacy")
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions { jvmTarget = "17" }
    buildFeatures { viewBinding = true }
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.androidx.activity.ktx)
}