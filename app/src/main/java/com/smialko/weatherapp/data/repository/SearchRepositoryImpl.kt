package com.smialko.weatherapp.data.repository

import com.smialko.weatherapp.data.mapper.toEntities
import com.smialko.weatherapp.data.network.api.ApiService
import com.smialko.weatherapp.domain.entity.City
import com.smialko.weatherapp.domain.entity.repository.SearchRepository
import javax.inject.Inject

class SearchRepositoryImpl @Inject constructor(
    private val apiService: ApiService
) : SearchRepository {
    override suspend fun search(query: String): List<City> {
        return apiService.searchCity(query).toEntities()
    }
}