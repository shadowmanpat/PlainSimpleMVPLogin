package com.nickagas.plainsimplemvplogin.Model

interface IUser {

    fun getEmail():String
    fun getPassword():String
    fun idValidData():Boolean

}