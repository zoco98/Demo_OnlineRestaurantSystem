package com.example.ors.request

import com.example.ors.model.CustomerModel
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class RegistrationRequest (
    @SerialName("customerModel") var customerModel: CustomerModel = CustomerModel(),
    @SerialName("saveDetails") var saveDetails: Boolean = false,
    @SerialName("accompaniedMembers") var accompaniedMembers: String? = null,
)