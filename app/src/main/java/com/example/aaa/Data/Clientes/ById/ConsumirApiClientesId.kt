package com.example.aaa.Data.Clientes.ById

import com.example.aaa.Data.Clientes.Model.RemoteResultClientes
import retrofit2.http.GET
import retrofit2.http.Query

interface ConsumirApiClientesId {

    @GET("Clientes/")
    suspend fun listClientesId(@Query("Id_Usuarios") Id_Usuarios:Int)
    : RemoteResultClientes
}