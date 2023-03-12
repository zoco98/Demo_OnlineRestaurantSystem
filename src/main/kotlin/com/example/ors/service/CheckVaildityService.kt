package com.example.ors.service

import com.example.ors.request.RegistrationRequest
import com.example.ors.response.RegistrationResponse
import com.example.ors.response.ValidationResponse
import java.util.regex.Pattern

fun checkValidityService(newCustomer: RegistrationRequest): ValidationResponse {

    val validData = (checkEmptyString(newCustomer.customerModel.userName) &&
            checkEmailId(newCustomer.customerModel.emailId) &&
            checkPhoneNo(newCustomer.customerModel.phoneNo) &&
            checkEmptyString(newCustomer.customerModel.preferredTableNo))

    return ValidationResponse().apply {
        if(validData){
            code="200"
            message="Success"
        }
        else {
            code = "400"
            if (!checkEmptyString(newCustomer.customerModel.userName)) message = "Username entered wrong"
            else if (!checkEmailId(newCustomer.customerModel.emailId)) message = "EmailId entered wrong"
            else if (!checkPhoneNo(newCustomer.customerModel.phoneNo)) message = "Phone no entered wrong"
            else if (!checkEmptyString(newCustomer.customerModel.preferredTableNo)) message = "Preferred Table No entered wrong"
        }
    }
}
fun checkEmptyString(str: String?): Boolean{
    return (str?.isNotEmpty()==true);
}
fun checkEmailId(emailId: String?): Boolean{
    val EMAIL_ADDRESS_PATTERN = Pattern.compile(
        "[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}" +
                "\\@" +
                "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}" +
                "(" +
                "\\." +
                "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25}" +
                ")+"
    )
        return (emailId?.isNotEmpty()==true) && EMAIL_ADDRESS_PATTERN.matcher(emailId).matches();
}
fun checkPhoneNo(phNo: String?): Boolean{
    val PHONE_NO_PATTERN = Pattern.compile(
        "[0-9]{10}\$"
    )
    return (phNo?.isNotEmpty()==true) && PHONE_NO_PATTERN.matcher(phNo).matches();
}

