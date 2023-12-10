package com.example.myapplication.Data.Service.AllUsuarios

import com.example.aaa.Data.Usuarios.Service.Get.Model.RemoteResultUsuarios
import retrofit2.http.GET

interface ConsumirApiAllUsuarios {

    @GET("Usuarios/")
    suspend fun  listAllUsuarios()
    : RemoteResultUsuarios
}