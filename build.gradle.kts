plugins {
    id("org.jetbrains.kotlin.jvm") version "1.3.72"
    id("com.github.johnrengelman.shadow") version "4.0.4"
    application
}

repositories {
    jcenter()
}

dependencies {
    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    testImplementation("org.jetbrains.kotlin:kotlin-test")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit")
    implementation ("net.dv8tion:JDA:4.1.1_165")
    implementation("com.jagrosh:jda-utilities:3.0.4")
    implementation("me.duncte123:botCommons:1.0.88")
    implementation("ch.qos.logback:logback-classic:1.2.3")
    implementation("io.github.cdimascio:java-dotenv:5.1.1")
}

application {
    mainClassName = "org.blazify.kotlin.BotKt"
}
