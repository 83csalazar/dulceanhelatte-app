package com.example.aaa.API.Data.MateriasPrimas.POST

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ClientPostMateriaPrima {
    fun makePostMateriaPrima():PostMateriasPrimas{
        return Retrofit.Builder()
            .baseUrl("https://noha.cl/app/")
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(PostMateriasPrimas::class.java)
    }
    suspend fun createMateriaPrima(nuevaMateriasPrimas: ListPostMateriasPrimas){
        val service= makePostMateriaPrima()
        return service.createMateriaPrima(nuevaMateriasPrimas)
    }
}