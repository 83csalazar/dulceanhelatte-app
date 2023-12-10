package com.example.aaa.Data.CodigoUnidades.GET.AllCodigoUnidades

import com.google.gson.Gson
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ClientAllCodigoUnidades{
    fun makeAllCodigoUnidades(): ConsumirApiAllCodigoUnidades {
        return Retrofit.Builder()
            .baseUrl("http:10.0.2.2:3000")
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(ConsumirApiAllCodigoUnidades::class.java)
    }
}
