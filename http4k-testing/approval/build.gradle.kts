description = "Http4k support for Approval Testing"

plugins {
    id("org.http4k.license-check")
    id("org.http4k.publishing")
    id("org.http4k.api-docs")
    id("org.http4k.code-coverage")
}

dependencies {
    api(project(":http4k-core"))
    api("com.github.javadev:underscore:_")
    api("org.jsoup:jsoup:_")

    implementation(Testing.junit.jupiter.api)
    implementation("com.natpryce:hamkrest:_")
    implementation(project(":http4k-format-jackson-yaml"))
    implementation(project(":http4k-cloudevents"))

    testImplementation(testFixtures(project(":http4k-core")))
    testImplementation(project(":http4k-core"))
    testImplementation(project(":http4k-testing-hamkrest"))
}
