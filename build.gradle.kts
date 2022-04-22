import org.springframework.boot.gradle.plugin.SpringBootPlugin

plugins {
    java // java插件
    id("org.springframework.boot") version "2.6.7"
}

repositories {
    // 依赖使用阿里云 maven 源
    maven {
        setUrl("https://maven.aliyun.com/repository/public/")
    }
    maven {
        setUrl("https://maven.aliyun.com/repository/spring/")
    }
    mavenCentral()
}
// 开发依赖
dependencies{
    implementation(platform(SpringBootPlugin.BOM_COORDINATES))
    implementation("org.springframework.boot:spring-boot-starter")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.springframework.boot:spring-boot-starter-actuator")

    testImplementation("org.springframework.boot:spring-boot-starter-test")
}

// test

// Java版本
java{
    toolchain{
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}