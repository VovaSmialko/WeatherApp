package com.smialko.weatherapp.data.network.dto

import com.google.gson.annotations.SerializedName

data class DayWeatherDto(
    @SerializedName("avgtemp_c") val tempC: Float,
    @SerializedName("mintemp_c") val tempMinC: Float,
    @SerializedName("maxtemp_c") val tempMaxC: Float,
    @SerializedName("condition") val conditionDto: ConditionDto
)
