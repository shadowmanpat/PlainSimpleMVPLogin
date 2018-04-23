package com.nickagas.plainsimplemvplogin.Model

import android.text.TextUtils
import android.util.Patterns

class User(private var email: String, private val password: String) : IUser{

    override fun getEmail(): String {
       return email
    }

    override fun getPassword(): String {
        return password
    }


    override fun idValidData(): Boolean {
        //email not empty
        //email matches pattern
        //password longer than 6
        return  !TextUtils.isEmpty(getEmail()) &&
                Patterns.EMAIL_ADDRESS.matcher(getEmail()).matches() &&
                getPassword().length > 6

    }

}