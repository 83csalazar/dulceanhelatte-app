package com.example.aaa.API.Data.CodigoUnidades.GET.AllCodigoUnidades

import com.google.gson.Gson
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ClientAllCodigoUnidades{
    fun makeAllCodigoUnidades(): ConsumirApiAllCodigoUnidades {
        return Retrofit.Builder()
            .baseUrl("https://noha.cl/app/")
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(ConsumirApiAllCodigoUnidades::class.java)
    }
}
