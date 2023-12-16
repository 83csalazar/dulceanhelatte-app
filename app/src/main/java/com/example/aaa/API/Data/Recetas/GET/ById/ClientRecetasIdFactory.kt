package com.example.aaa.API.Data.Recetas.GET.ById

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ClientRecetasIdFactory {
    fun makeRecetasId(): ConsumirApiRecetasId {
        return Retrofit.Builder()
            .baseUrl("https://noha.cl/app/")
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(ConsumirApiRecetasId::class.java)
    }
}