package com.example.aaa.API.Data.Clientes.ById

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ClientClientesIdFactory {
    fun makeClientesId():ConsumirApiClientesId{
        return Retrofit.Builder()
            .baseUrl("https://noha.cl/app/")
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(ConsumirApiClientesId::class.java)
    }
}