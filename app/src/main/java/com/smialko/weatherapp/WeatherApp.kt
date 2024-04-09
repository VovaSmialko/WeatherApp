package com.smialko.weatherapp

import android.app.Application
import com.smialko.weatherapp.di.ApplicationComponent
import com.smialko.weatherapp.di.DaggerApplicationComponent

class WeatherApp : Application() {

    lateinit var applicationComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()
        applicationComponent = DaggerApplicationComponent.factory().create(this)
    }
}