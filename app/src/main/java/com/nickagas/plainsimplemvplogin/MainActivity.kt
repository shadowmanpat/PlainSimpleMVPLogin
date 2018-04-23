package com.nickagas.plainsimplemvplogin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.nickagas.plainsimplemvplogin.Presenter.ILoginPresenter
import com.nickagas.plainsimplemvplogin.Presenter.LoginPresenter
import com.nickagas.plainsimplemvplogin.View.ILoginView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),ILoginView {


    var loginPresenter: ILoginPresenter = LoginPresenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        button.setOnClickListener {

            loginPresenter.onLogin(emailTxt.text.toString(),passTxt.text.toString())
        }
    }

    override fun onLoginResult(message: String) {
       Toast.makeText(this,message,Toast.LENGTH_SHORT).show()
    }
}
