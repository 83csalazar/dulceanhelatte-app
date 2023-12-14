package com.example.aaa.API.Data.CodigoUnidades.POST


import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ClientPostCodigoUnidades {
    fun makePostUnidades():PostCodigoUnidades{
        return Retrofit.Builder()
            .baseUrl("http://10.0.2.2:3000/")
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(PostCodigoUnidades::class.java)
    }
    suspend fun createCodigo(nuevoCodigo: ListPostCodigoUnidades){
        val service= makePostUnidades()
        return service.createCodigo(nuevoCodigo)
    }
}