/**
 * This project meant to be self containing root library
 */

kt_android_library(
    packageName = "com.stepango.example",
    dependencies = dependencies(
        "androidx.core:core-ktx:1.2.0",
        "androidx.appcompat:appcompat:1.1.0",
        "com.google.android.material:material:1.1.0",
        "androidx.constraintlayout:constraintlayout:1.1.3",
        "androidx.navigation:navigation-fragment-ktx:2.2.1",
        "androidx.navigation:navigation-ui-ktx:2.2.1"
    ),
    testDependencies = dependencies("junit:junit:4.12"),
    androidTestDependencies = dependencies(
        "androidx.test.ext:junit:1.1.1",
        "androidx.test.espresso:espresso-core:3.2.0"
    )
)