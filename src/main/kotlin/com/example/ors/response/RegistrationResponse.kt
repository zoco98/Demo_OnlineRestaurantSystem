package com.example.ors.response

import com.example.ors.model.ErrorModel
import com.example.ors.model.StatusModel
import com.example.ors.model.WarningModel
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import java.lang.Error

@Serializable
data class RegistrationResponse (
    @SerialName("status") var status: StatusModel?= StatusModel(),
    @SerialName("error") var error: ErrorModel?= ErrorModel(),
    @SerialName("warning") var warning: WarningModel?= WarningModel()
)