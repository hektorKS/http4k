import org.http4k.internal.ModuleLicense.Apache2

description = "Deprecated. Use : :http4k-connect-ai-openai"

val license by project.extra { Apache2 }

plugins {
    id("org.http4k.module")
    id("org.http4k.connect.module")
    id("org.http4k.connect.client")
}

dependencies {
    api(project(":http4k-connect-ai-openai"))
}