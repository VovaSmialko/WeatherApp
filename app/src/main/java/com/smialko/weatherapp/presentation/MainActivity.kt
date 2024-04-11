package com.smialko.weatherapp.presentation

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.arkivanov.decompose.defaultComponentContext
import com.smialko.weatherapp.WeatherApp
import com.smialko.weatherapp.data.network.api.ApiFactory
import com.smialko.weatherapp.domain.entity.usecase.ChangeFavouriteStateUseCase
import com.smialko.weatherapp.domain.entity.usecase.SearchCityUseCase
import com.smialko.weatherapp.presentation.root.DefaultRootComponent
import com.smialko.weatherapp.presentation.root.RootContent
import com.smialko.weatherapp.presentation.ui.theme.WeatherAppTheme
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

class MainActivity : ComponentActivity() {

    @Inject
    lateinit var rootComponentFactory: DefaultRootComponent.Factory


    override fun onCreate(savedInstanceState: Bundle?) {
        (applicationContext as WeatherApp).applicationComponent.inject(this)
        super.onCreate(savedInstanceState)

        setContent {
            RootContent(component = rootComponentFactory.create(defaultComponentContext()))
        }
    }
}
