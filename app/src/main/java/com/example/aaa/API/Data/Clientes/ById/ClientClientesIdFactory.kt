package com.example.aaa.API.Data.Clientes.ById

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ClientClientesIdFactory {
    fun makeClientesId():ConsumirApiClientesId{
        return Retrofit.Builder()
            .baseUrl("http://10.0.2.2:3000/")
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(ConsumirApiClientesId::class.java)
    }
}