package com.example.aaa.API.Data.Clientes.ById

import com.example.aaa.API.Data.Clientes.Model.RemoteResultClientes
import retrofit2.http.GET
import retrofit2.http.Query

interface ConsumirApiClientesId {

    @GET("Clientes/")
    suspend fun listClientesId(@Query("Id_Usuarios") Id_Usuarios:Int)
    : RemoteResultClientes
}