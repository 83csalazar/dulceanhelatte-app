package com.example.aaa.API.Data.Usuarios.Service.Get.ById

import com.example.aaa.API.Data.Usuarios.Service.Get.Model.Lista
import com.example.aaa.API.Data.Usuarios.Service.Get.Model.RemoteResultUsuarios
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ConsumirApiUsuariosId {
    @GET("Usuarios/{Id_Usuario}")
    suspend fun  listUsuarioId(@Path("Id_Usuarios") Id_Usuario: Int)
    : List<Lista>
}

