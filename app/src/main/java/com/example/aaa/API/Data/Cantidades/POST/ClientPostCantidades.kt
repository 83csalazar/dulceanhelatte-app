package com.example.aaa.API.Data.Cantidades.POST

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ClientPostCantidades {
    fun makePostCantidades():PostCantidades{
        return Retrofit.Builder()
            .baseUrl("http://10.0.2.2:3000/")
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(PostCantidades::class.java)
    }
    suspend fun createCantidades(nuevaCantidades: ListPostCantidades){
        val service= makePostCantidades()
        return service.createCantidades(nuevaCantidades)
    }
}