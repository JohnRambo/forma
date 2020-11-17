import tools.forma.android.feature.applyFeatures
import tools.forma.android.feature.kotlinFeatureDefinition
import tools.forma.android.target.ApiTarget
import tools.forma.android.target.LibraryTarget
import tools.forma.android.validation.validate
import tools.forma.android.validation.validator
import tools.forma.android.owner.Owner
import tools.forma.android.owner.NoOwner
import tools.forma.android.validation.disallowResources
import org.gradle.api.Project
import tools.forma.android.dependencies.applyDependencies

fun Project.api(
    owner: Owner = NoOwner,
    dependencies: FormaDependency = emptyDependency()
) {

    disallowResources()

    validate(ApiTarget)
    applyFeatures(
        kotlinFeatureDefinition()
    )
    applyDependencies(
        validator = validator(ApiTarget, LibraryTarget),
        dependencies = dependencies
    )
}
