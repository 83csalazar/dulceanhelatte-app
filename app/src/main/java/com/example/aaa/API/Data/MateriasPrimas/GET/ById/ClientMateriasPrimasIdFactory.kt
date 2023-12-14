package com.example.aaa.API.Data.MateriasPrimas.GET.ById

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ClientMateriasPrimasIdFactory {
    fun makeMateriasPrimasId(): ConsumirApiMateriasPrimasId {
        return Retrofit.Builder()
            .baseUrl("http://10.0.2.2:3000/")
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(ConsumirApiMateriasPrimasId::class.java)
    }
}