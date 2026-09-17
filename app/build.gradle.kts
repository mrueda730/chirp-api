plugins {
    id("chirp.spring-boot-app")
}

group = "com.mrueda"
version = "0.0.1-SNAPSHOT"
description = "chirp"

dependencies {
    implementation(projects.user)
    implementation(projects.chat)
    implementation(projects.notification)
    implementation(projects.common)
    implementation(libs.spring.boot.starter.data.jpa)
    runtimeOnly(libs.postgresql)

}

kotlin {
    compilerOptions {
        freeCompilerArgs.addAll("-Xjsr305=strict", "-Xannotation-default-target=param-property")
    }
}

allOpen {
    annotation("jakarta.persistence.Entity")
    annotation("jakarta.persistence.MappedSuperclass")
    annotation("jakarta.persistence.Embeddable")
}

tasks.withType<Test> {
    useJUnitPlatform()
}
