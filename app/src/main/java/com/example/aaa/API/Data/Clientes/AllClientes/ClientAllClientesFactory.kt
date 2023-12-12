package com.example.aaa.API.Data.Clientes.AllClientes

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ClientAllClientesFactory {
    fun makeClientAllClientes(): ConsumirApiAllClientes {
        return Retrofit.Builder()
            .baseUrl("https://noha.cl/app/")
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(ConsumirApiAllClientes::class.java)
    }
}