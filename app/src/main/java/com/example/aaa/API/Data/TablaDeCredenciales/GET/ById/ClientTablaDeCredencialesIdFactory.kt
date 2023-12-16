package com.example.aaa.API.Data.TablaDeCredenciales.GET.ById

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ClientTablaDeCredencialesIdFactory {
    fun makeTablaDeCredencialesId(): ConsumirApiTablaDeCredencialesId {
        return Retrofit.Builder()
            .baseUrl("https://noha.cl/app/")
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(ConsumirApiTablaDeCredencialesId::class.java)
    }
}