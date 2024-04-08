package com.smialko.weatherapp.domain.entity.usecase

import com.smialko.weatherapp.domain.entity.repository.FavouriteRepository
import javax.inject.Inject

class GetFavouriteCitiesUseCase @Inject constructor(
    private val repository: FavouriteRepository
) {

    operator fun invoke() = repository.favouriteCities
}