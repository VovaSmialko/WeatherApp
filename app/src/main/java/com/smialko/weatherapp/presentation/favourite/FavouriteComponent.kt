package com.smialko.weatherapp.presentation.favourite

import com.smialko.weatherapp.domain.entity.City
import kotlinx.coroutines.flow.StateFlow

interface FavouriteComponent {


    val model: StateFlow<FavouriteStore.State>

    fun onClickSearch()

    fun onClickAddFavourite()

    fun onCityItemClick(city: City)
}