package com.example.aaa.API.Data.MateriasPrimas.GET.ById

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ClientMateriasPrimasIdFactory {
    fun makeMateriasPrimasId(): ConsumirApiMateriasPrimasId {
        return Retrofit.Builder()
            .baseUrl("https://noha.cl/app/")
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(ConsumirApiMateriasPrimasId::class.java)
    }
}