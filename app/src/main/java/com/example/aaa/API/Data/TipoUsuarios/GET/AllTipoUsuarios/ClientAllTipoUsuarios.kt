package com.example.aaa.API.Data.TipoUsuarios.GET.AllTipoUsuarios

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ClientAllTipoUsuarios {
    fun makeAllTipoUsuarios(): ConsumirAllTipoUsuarios {
        return Retrofit.Builder()
            .baseUrl("https://noha.cl/app/")
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(ConsumirAllTipoUsuarios::class.java)
    }
}