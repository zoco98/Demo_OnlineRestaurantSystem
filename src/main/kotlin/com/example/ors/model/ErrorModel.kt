package com.example.ors.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ErrorModel (
    @SerialName("error") var error:Boolean?=false,
    @SerialName("errorMessage") var errorMessage:String?=null,
    @SerialName("errorCode") var errorCode:String="404"
)