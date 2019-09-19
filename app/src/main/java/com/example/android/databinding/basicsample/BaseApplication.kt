package com.example.android.databinding.basicsample

import android.app.Application

class BaseApplication : Application() {
    companion object {
         lateinit var INSTANCE: BaseApplication

         lateinit var appComponent: AppComponent
    }

    override fun onCreate() {
        super.onCreate()
        INSTANCE = this
        appComponent = AppComponent()
    }

    fun getAppComponent() : AppComponent{
        return appComponent
    }


}