package com.example.ors.plugins

import com.example.ors.controller.RegistrationController
import com.example.ors.model.CustomerModel
import com.example.ors.request.RegistrationRequest
import com.example.ors.response.RegistrationResponse
import io.ktor.server.routing.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.request.*
import io.netty.handler.codec.http2.Http2Error
import org.koin.ktor.ext.inject

/*
* ----------A restaurant System------------
* First Customer arrives at restaurant and registered himself
*/

fun Application.configureRouting() {
    routing {
        //val registrationController by inject<RegistrationController>()
        /*aggregateGetRoutes()
        aggregatePostRoutes()*/
        get("/"){
            call.respondText("Hello Customer,Warm greetings, please register yourself first")
        }
        post("/register"){
            val newCustomer= call.receive<RegistrationRequest>()
            val registrationResponse: RegistrationResponse = RegistrationController().register(newCustomer)
            println(registrationResponse)
            if(registrationResponse!=null) {
                call.respond(registrationResponse)
            }else{
                call.respondText ("${RegistrationResponse()}")
            }
        }
    }
}