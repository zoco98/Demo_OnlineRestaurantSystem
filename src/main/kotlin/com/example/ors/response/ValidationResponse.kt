package com.example.ors.response

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ValidationResponse (
    @SerialName("code") var code: String?=null,
    @SerialName("message") var message: String?=null,
)