package com.example.aaa.API.Data.TablaDeCredenciales.GET.ById

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ClientTablaDeCredencialesIdFactory {
    fun makeTablaDeCredencialesId(): ConsumirApiTablaDeCredencialesId {
        return Retrofit.Builder()
            .baseUrl("http://10.0.2.2:3000/")
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(ConsumirApiTablaDeCredencialesId::class.java)
    }
}