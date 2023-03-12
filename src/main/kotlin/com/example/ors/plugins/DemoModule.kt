package com.example.ors.plugins

import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureDemoModule() {
    routing {
        get("/") {
            call.respondText("Hello Customer!")
        }
        //http://127.0.0.1:8080/Ram
        get("/{name}"){
            println("URI:${call.request.uri}")
            println("parameter:${call.parameters["name"]}")
            call.respondText(call.parameters["name"].toString())
            println("Header:${call.request.headers.names()}")//to read headers in postman
            println("Header name: ${call.request.headers["User-Agent"]}")//to read headers their values
        }
        //http://127.0.0.1:8080/api/params?name=Sriparna&email=sriparna1998@gmail.com
        get("/api/params"){
            println("URI:${call.request.uri}")
            println("query params: ${call.request.queryParameters.names()}")
            println("query params: ${call.request.queryParameters["name"]}")
            println("query params: ${call.request.queryParameters["email"]}")
        }
    }
}