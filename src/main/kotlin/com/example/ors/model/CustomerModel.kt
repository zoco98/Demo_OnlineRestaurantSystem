package com.example.ors.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class CustomerModel(
    @SerialName("userName") var userName: String?= null,
    @SerialName("emailId") var emailId: String?= null,
    @SerialName("phoneNo") var phoneNo: String?= null,
    @SerialName("age") var age: String?= null,
    @SerialName("foodPreference") var foodPreference: String?= null,
    @SerialName("premiumCustomer") var premiumCustomer: Boolean= false,
    @SerialName("preferredTableNo") var preferredTableNo: String?= null

)
