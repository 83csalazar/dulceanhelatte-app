package com.example.aaa.API.Data.Recetas.GET.AllRecetas

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ClientAllRecetasFactory {
    fun makeAllRecetas(): ConsumirApiAllRecetas {
        return Retrofit.Builder()
            .baseUrl("http://10.0.2.2:3000/")
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(ConsumirApiAllRecetas::class.java)
    }

}