plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    kotlin("kapt")
    id("com.google.dagger.hilt.android")

}

android {
    namespace = "com.example.hiltdemo"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.hiltdemo"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }

    buildFeatures {
        dataBinding; true
    }

}

dependencies {

    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("androidx.legacy:legacy-support-v4:1.0.0")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.7.0")
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.7.0")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    //hilt

  //  implementation("com.google.dagger:hilt-android-compiler:2.44")

    //Dagger-Hilt
    val hiltVersion = "2.50"
    implementation("com.google.dagger:hilt-android:$hiltVersion")
   // implementation("com.google.dagger:hilt-android-compiler:$hiltVersion")
    kapt("com.google.dagger:hilt-android-compiler:$hiltVersion")


    //nav component
    val navVersion = "2.7.6"
    implementation("androidx.navigation:navigation-fragment-ktx:$navVersion")
    implementation("androidx.navigation:navigation-ui-ktx:$navVersion")

    //retrofit library & Gson converter-------------
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")
    implementation("com.squareup.okhttp3:okhttp:5.0.0-alpha.1")

    //interceptor
    implementation("com.squareup.okhttp3:logging-interceptor:5.0.0-alpha.1")

    //picasso
    implementation("com.squareup.picasso:picasso:2.71828")

    //glide
    implementation("com.github.bumptech.glide:glide:4.16.0")


}