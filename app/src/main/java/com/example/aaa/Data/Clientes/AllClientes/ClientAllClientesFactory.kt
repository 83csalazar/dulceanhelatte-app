package com.example.aaa.Data.Clientes.AllClientes

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ClientAllClientesFactory {
    fun makeClientAllClientes(): ConsumirApiAllClientes {
        return Retrofit.Builder()
            .baseUrl("http://10.0.2.2:3000")
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(ConsumirApiAllClientes::class.java)
    }
}