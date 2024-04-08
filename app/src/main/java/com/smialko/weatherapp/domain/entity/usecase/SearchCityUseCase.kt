package com.smialko.weatherapp.domain.entity.usecase

import com.smialko.weatherapp.domain.entity.repository.SearchRepository
import javax.inject.Inject

class SearchCityUseCase @Inject constructor(
    private val repository: SearchRepository
) {

    suspend operator fun invoke(query: String) = repository.search(query)
}