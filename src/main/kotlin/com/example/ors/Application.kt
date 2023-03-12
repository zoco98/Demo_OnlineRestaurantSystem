package com.example.ors

import com.example.ors.DI.configureDI
import com.example.ors.plugins.configureDemoModule
import com.example.ors.plugins.configureRouting
import com.example.ors.plugins.configureSerialization
import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import io.ktor.serialization.kotlinx.json.*
import io.ktor.server.plugins.contentnegotiation.*
import org.koin.ktor.plugin.Koin
import org.koin.logger.slf4jLogger

fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0", module = Application::module)
        .start(wait = true)
}

fun Application.module() {
    //configureDI()
    configureSerialization()
    configureRouting()
    //configureDemoModule()
}

