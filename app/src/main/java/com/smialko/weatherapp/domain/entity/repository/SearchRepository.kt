package com.smialko.weatherapp.domain.entity.repository

import com.smialko.weatherapp.domain.entity.City

interface SearchRepository {
    suspend fun search(query: String): List<City>
}