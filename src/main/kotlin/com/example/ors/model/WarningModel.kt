package com.example.ors.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class WarningModel (

    @SerialName("warning") var warning:Boolean?=false,
    @SerialName("warningMessage") var warningMessage:String?=null,
    @SerialName("warningCode") var warningCode:String="400"
)