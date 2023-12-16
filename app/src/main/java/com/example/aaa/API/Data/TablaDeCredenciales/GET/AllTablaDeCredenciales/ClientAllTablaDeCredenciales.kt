package com.example.aaa.API.Data.TablaDeCredenciales.GET.AllTablaDeCredenciales

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ClientAllTablaDeCredenciales {
    fun makeAllTablaDeCredenciales(): ConsumirApiAllTablaDeCredenciales {
        return Retrofit.Builder()
            .baseUrl("https://noha.cl/app/")
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(ConsumirApiAllTablaDeCredenciales::class.java)
    }
}