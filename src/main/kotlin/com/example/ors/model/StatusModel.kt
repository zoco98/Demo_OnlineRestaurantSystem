package com.example.ors.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class StatusModel (
    @SerialName("status") var status:Boolean? =null,
    @SerialName("statusMessage") var statusMessage:String?=null,
    @SerialName("statusCode") var statusCode:String="200"

)