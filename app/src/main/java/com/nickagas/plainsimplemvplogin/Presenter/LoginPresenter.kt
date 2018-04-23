package com.nickagas.plainsimplemvplogin.Presenter

import com.nickagas.plainsimplemvplogin.Model.User
import com.nickagas.plainsimplemvplogin.View.ILoginView

class LoginPresenter(var loginView: ILoginView) : ILoginPresenter {

    override fun onLogin(email: String, password: String) {
        var user = User(email,password)

        var idLoginSuccess = user.idValidData()
        if (idLoginSuccess){
            loginView.onLoginResult("Login Success")
        }else{
            loginView.onLoginResult("Login Error")
        }
    }
}