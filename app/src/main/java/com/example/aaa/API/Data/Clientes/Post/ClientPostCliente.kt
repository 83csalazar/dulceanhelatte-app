package com.example.aaa.API.Data.Clientes.Post

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ClientPostCliente {
    fun makePostCliente():PostCliente{
        return Retrofit.Builder()
            .baseUrl("https://noha.cl/app/")
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(PostCliente::class.java)
    }
    suspend fun  createCliente(nuevoCliente: ListaPostCliente) {
        val service= makePostCliente()
        return service.createCliente(nuevoCliente)
    }
}