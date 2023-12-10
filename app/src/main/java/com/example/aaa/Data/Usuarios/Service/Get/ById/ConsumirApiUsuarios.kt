package com.example.aaa.Data.Usuarios.Service.Get.ById

import com.example.aaa.Data.Usuarios.Service.Get.Model.RemoteResultUsuarios
import retrofit2.http.GET
import retrofit2.http.Query

interface ConsumirApiUsuariosId {
    @GET("Usuarios/")
    suspend fun  listUsuarioId(@Query("Id_Usuarios") Id_Usuario: Int)
    : RemoteResultUsuarios
}

