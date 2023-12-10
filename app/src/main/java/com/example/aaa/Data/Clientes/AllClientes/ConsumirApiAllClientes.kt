package com.example.aaa.Data.Clientes.AllClientes

import com.example.aaa.Data.Clientes.Model.RemoteResultClientes
import retrofit2.http.GET

interface ConsumirApiAllClientes {

    @GET("Clientes")
    suspend fun listAllClientes()
    :RemoteResultClientes

}