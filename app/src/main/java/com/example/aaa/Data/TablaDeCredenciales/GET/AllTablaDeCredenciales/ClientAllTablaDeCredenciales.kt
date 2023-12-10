package com.example.aaa.Data.TablaDeCredenciales.GET.AllTablaDeCredenciales

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ClientAllTablaDeCredenciales {
    fun makeAllTablaDeCredenciales(): ConsumirApiAllTablaDeCredenciales {
        return Retrofit.Builder()
            .baseUrl("http://10.0.2.2:3000")
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(ConsumirApiAllTablaDeCredenciales::class.java)
    }
}