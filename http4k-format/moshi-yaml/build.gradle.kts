description = "Http4k YAML support using Moshi and SnakeYaml as an underlying engine"

plugins {
    id("org.http4k.license-check")
    id("org.http4k.publishing")
    id("org.http4k.api-docs")
    id("org.http4k.code-coverage")
}

dependencies {
    api(project(":http4k-realtime-core"))
    api(project(":http4k-format-moshi"))
    api("org.yaml:snakeyaml:_")

    testImplementation(project(":http4k-core"))
    testImplementation("dev.forkhandles:values4k:_")
    testImplementation(testFixtures(project(":http4k-core")))
    testImplementation(testFixtures(project(":http4k-format-core")))
}
