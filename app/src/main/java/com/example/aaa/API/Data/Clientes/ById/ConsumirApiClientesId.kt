package com.example.aaa.API.Data.Clientes.ById

import com.example.aaa.API.Data.Clientes.Model.RemoteResultClientes
import com.example.aaa.API.Data.Usuarios.Service.Get.Model.Lista
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ConsumirApiClientesId {

    @GET("Clientes/{Id_Cliente")
    suspend fun listClientesId(@Path("Id_Cliente") Id_Usuario:Int)
    : List<com.example.aaa.API.Data.Clientes.Model.Lista>
}