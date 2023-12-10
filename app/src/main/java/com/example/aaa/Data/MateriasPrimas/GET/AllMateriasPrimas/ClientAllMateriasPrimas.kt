package com.example.aaa.Data.MateriasPrimas.GET.AllMateriasPrimas

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ClientAllMateriasPrimas {
    fun makeAllMateriasPrimas(): ConsumirApiAllMateriasPrimas {
        return Retrofit.Builder()
            .baseUrl("http://10.0.2.2:3000")
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(ConsumirApiAllMateriasPrimas::class.java)
    }
}