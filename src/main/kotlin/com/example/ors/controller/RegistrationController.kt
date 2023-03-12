package com.example.ors.controller

import com.example.ors.request.RegistrationRequest
import com.example.ors.response.RegistrationResponse
import com.example.ors.response.ValidationResponse
import com.example.ors.service.checkValidityService

class RegistrationController  {
    fun register(registrationRequest: RegistrationRequest): RegistrationResponse {
        val vResp: ValidationResponse  =checkValidityService(registrationRequest)
        if(RegistrationResponse().status?.statusCode.equals(vResp.code)){
                return RegistrationResponse().apply {
                    status?.status =true
                    status?.statusMessage=vResp.message
            }
        }
        else if (RegistrationResponse().warning?.warningCode.equals(vResp.code)){
            return RegistrationResponse().apply {
                warning?.warning =true
                warning?.warningMessage=vResp.message
            }
        }
        else{
            return RegistrationResponse().apply {
                error?.error =true
                error?.errorMessage="Failed"
            }
        }
    }
}