package com.example.aaa.API.Data.ProductosElaborados.GET.ById

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ClientProductosElaboradosIdFactory {
    fun makeProductosElaboradosIdFactory(): ConsumirApiProductosElaboradosId {
        return Retrofit.Builder()
            .baseUrl("https://noha.cl/app/a")
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(ConsumirApiProductosElaboradosId::class.java)
    }
}