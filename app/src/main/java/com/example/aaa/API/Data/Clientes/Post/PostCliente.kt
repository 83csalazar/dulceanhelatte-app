package com.example.aaa.API.Data.Clientes.Post

import retrofit2.http.Body
import retrofit2.http.POST

interface PostCliente {

    @POST("Clientes/agregar/")
    suspend fun createCliente(@Body nuevoCliente:ListaPostCliente)
}