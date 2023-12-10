package com.example.aaa.Data.TipoUsuarios.GET.AllTipoUsuarios

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ClientAllTipoUsuarios {
    fun makeAllTipoUsuarios(): ConsumirAllTipoUsuarios {
        return Retrofit.Builder()
            .baseUrl("http://10.0.2.2:3000")
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(ConsumirAllTipoUsuarios::class.java)
    }
}