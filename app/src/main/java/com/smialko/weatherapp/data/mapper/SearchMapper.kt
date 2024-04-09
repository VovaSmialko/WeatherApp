package com.smialko.weatherapp.data.mapper

import com.smialko.weatherapp.data.network.dto.CityDto
import com.smialko.weatherapp.domain.entity.City

fun CityDto.toEntity(): City = City(id, name, country)

fun List<CityDto>.toEntities(): List<City> = map { it.toEntity() }