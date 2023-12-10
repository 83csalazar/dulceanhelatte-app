package com.example.aaa.Data.ProductosElaborados.GET.ById

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ClientProductosElaboradosIdFactory {
    fun makeProductosElaboradosIdFactory(): ConsumirApiProductosElaboradosId {
        return Retrofit.Builder()
            .baseUrl("http://10.0.2.2:3000")
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(ConsumirApiProductosElaboradosId::class.java)
    }
}