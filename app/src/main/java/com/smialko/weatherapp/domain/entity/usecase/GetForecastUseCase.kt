package com.smialko.weatherapp.domain.entity.usecase

import com.smialko.weatherapp.domain.entity.repository.WeatherRepository
import javax.inject.Inject

class GetForecastUseCase @Inject constructor(
    private val repository: WeatherRepository
) {

    suspend operator fun invoke(cityId: Int) = repository.getForecast(cityId)
}