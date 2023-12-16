package com.example.aaa.API.Data.ProductosElaborados.GET.AllProductosElaborados

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ClientProductosElaboradosFactory {

    fun makeProductosElaborados(): ConsumirApiAllProductosElaborados {
        return Retrofit.Builder()
            .baseUrl("https://noha.cl/app/")
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(ConsumirApiAllProductosElaborados::class.java)
    }
}