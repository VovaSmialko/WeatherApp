package com.smialko.weatherapp.domain.entity.usecase

import com.smialko.weatherapp.domain.entity.City
import com.smialko.weatherapp.domain.entity.repository.FavouriteRepository
import javax.inject.Inject

class ChangeFavouriteStateUseCase @Inject constructor(
    private val repository: FavouriteRepository
) {

    suspend fun addToFavourite(city: City) = repository.addToFavourite(city)
    suspend fun removeFromFavourite(cityId: Int) = repository.removeFromFavourite(cityId)
}