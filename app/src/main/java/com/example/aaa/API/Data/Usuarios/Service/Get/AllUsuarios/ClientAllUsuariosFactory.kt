package com.example.myapplication.Data.Service.AllUsuarios

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ClientAllUsuariosFactory {
    fun makeClienteAllUsuarios(): ConsumirApiAllUsuarios {
        return Retrofit.Builder()
            .baseUrl("http://10.0.2.2:3000/")
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(ConsumirApiAllUsuarios::class.java)
    }
}
