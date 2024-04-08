package com.smialko.weatherapp.data.network.local.local.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "favourite_cities")
data class CityDbModel(
    @PrimaryKey val id: Int,
    val name: String,
    val country: String
)