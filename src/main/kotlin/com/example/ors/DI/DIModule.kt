package com.example.ors.DI

import com.example.ors.controller.RegistrationController
import com.example.ors.response.RegistrationResponse
import io.ktor.server.application.*
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.ModuleDeclaration
import org.koin.dsl.module
import org.koin.ktor.plugin.Koin
import org.koin.logger.slf4jLogger

fun Application.configureDI(){
    val appModule = module {
        //singleOf(::UserRepositoryImpl) { bind<UserRepository>() }
        single{::RegistrationController}
    }
    install(Koin) {
        slf4jLogger()
        modules(appModule)
    }
}