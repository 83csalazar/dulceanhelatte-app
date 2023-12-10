package com.example.aaa.Data.ProductosElaborados.GET.AllProductosElaborados

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ClientProductosElaboradosFactory {

    fun makeProductosElaborados(): ConsumirApiAllProductosElaborados {
        return Retrofit.Builder()
            .baseUrl("http://10.0.2.2:3000")
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(ConsumirApiAllProductosElaborados::class.java)
    }
}