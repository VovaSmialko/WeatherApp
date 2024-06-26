package com.smialko.weatherapp.data.repository

import android.util.Log
import com.smialko.weatherapp.data.mapper.toEntity
import com.smialko.weatherapp.data.network.api.ApiService
import com.smialko.weatherapp.domain.entity.Forecast
import com.smialko.weatherapp.domain.entity.Weather
import com.smialko.weatherapp.domain.entity.repository.WeatherRepository
import javax.inject.Inject
import kotlin.math.log

class WeatherRepositoryImpl @Inject constructor(
    private val apiService: ApiService
) : WeatherRepository {
    override suspend fun getWeather(cityId: Int): Weather {
        return apiService.loadCurrentWeather("$PREFIX_CITY_ID$cityId").toEntity()

    }

    override suspend fun getForecast(cityId: Int): Forecast {
        return apiService.loadForecast("$PREFIX_CITY_ID$cityId").toEntity()
    }

    private companion object {
        private const val PREFIX_CITY_ID = "id:"
    }
}