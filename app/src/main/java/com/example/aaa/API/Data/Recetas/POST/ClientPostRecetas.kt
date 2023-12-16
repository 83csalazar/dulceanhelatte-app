package com.example.aaa.API.Data.Recetas.POST

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ClientPostRecetas {
    fun makePostRecetas():PostReceta{
        return Retrofit.Builder()
            .baseUrl("https://noha.cl/app/")
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(PostReceta::class.java)
    }
    suspend fun CreateReceta(nuevaReceta:ListaPostReceta){
        val service= makePostRecetas()
        return service.createReceta(nuevaReceta)
    }
}