package com.example.aaa.Data.Cantidades.GET.ById

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ClientCantidadesIdFactory {
    fun makeCantidadesId(): ConsumirApiCantidadesId {
        return Retrofit.Builder()
            .baseUrl("http://10.0.2.2:3000")
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(ConsumirApiCantidadesId::class.java)
    }
}