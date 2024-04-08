package com.smialko.weatherapp.domain.entity.repository

import com.smialko.weatherapp.domain.entity.City
import com.smialko.weatherapp.domain.entity.Forecast
import com.smialko.weatherapp.domain.entity.Weather
import kotlinx.coroutines.flow.Flow

interface WeatherRepository {

    suspend fun getWeather(cityId: Int): Weather
    suspend fun getForecast(cityId: Int): Forecast
}