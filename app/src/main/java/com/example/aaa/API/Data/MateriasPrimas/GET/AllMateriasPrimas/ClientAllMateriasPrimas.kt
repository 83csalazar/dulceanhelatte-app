package com.example.aaa.API.Data.MateriasPrimas.GET.AllMateriasPrimas

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ClientAllMateriasPrimas {
    fun makeAllMateriasPrimas(): ConsumirApiAllMateriasPrimas {
        return Retrofit.Builder()
            .baseUrl("https://noha.cl/app/")
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(ConsumirApiAllMateriasPrimas::class.java)
    }
}