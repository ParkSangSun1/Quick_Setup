plugins {
    id ("org.jetbrains.kotlin.jvm")
    id ("kotlin-kapt")
}

dependencies {

    // dager hilt
    implementation (DaggerHilt.DAGGER_HILT_JAVAX)
}