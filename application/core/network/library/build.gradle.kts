library(
    packageName = "com.stepango.blockme.core.network.library",
    dependencies = deps(
        squareup.retrofit,
        google.gson,
        google.dagger
    ) + deps(
        target(":common:util")
    )
)
