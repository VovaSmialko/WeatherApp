package com.smialko.weatherapp.di

import android.content.Context
import com.smialko.weatherapp.data.local.db.FavouriteCitiesDao
import com.smialko.weatherapp.data.local.db.FavouriteDatabase
import com.smialko.weatherapp.data.network.api.ApiFactory
import com.smialko.weatherapp.data.network.api.ApiService
import com.smialko.weatherapp.data.repository.FavouriteRepositoryImpl
import com.smialko.weatherapp.data.repository.SearchRepositoryImpl
import com.smialko.weatherapp.data.repository.WeatherRepositoryImpl
import com.smialko.weatherapp.domain.entity.repository.FavouriteRepository
import com.smialko.weatherapp.domain.entity.repository.SearchRepository
import com.smialko.weatherapp.domain.entity.repository.WeatherRepository
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
interface DataModule {

    @[ApplicationScope Binds]
    fun bindFavouriteRepository(impl: FavouriteRepositoryImpl): FavouriteRepository

    @[ApplicationScope Binds]
    fun bindWeatherRepository(impl: WeatherRepositoryImpl): WeatherRepository

    @[ApplicationScope Binds]
    fun bindSearchRepository(impl: SearchRepositoryImpl): SearchRepository

    companion object {

        @[ApplicationScope Provides]
        fun provideApiService(): ApiService = ApiFactory.apiService

        @[ApplicationScope Provides]
        fun provideFavouriteDatabase(context: Context): FavouriteDatabase {
            return FavouriteDatabase.getInstance(context)
        }

        @[ApplicationScope Provides]
        fun provideFavouriteCitiesDao(database: FavouriteDatabase): FavouriteCitiesDao {
            return database.favouriteCitiesDao()
        }
    }
}