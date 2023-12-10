package com.example.aaa.Data.Cantidades

import com.example.aaa.Data.ConsumirApiAllCantidades
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ClientAllCantidadesFactory {
    fun makeAllCantidades():ConsumirApiAllCantidades{
        return Retrofit.Builder()
            .baseUrl("http://10.0.2.2:3000")
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(ConsumirApiAllCantidades::class.java)
    }
}