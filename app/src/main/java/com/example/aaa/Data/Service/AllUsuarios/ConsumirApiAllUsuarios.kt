package com.example.myapplication.Data.Service.AllUsuarios

import com.example.aaa.Data.Model.RemoteResultUsuarios
import retrofit2.http.GET

interface ConsumirApiAllUsuarios {

    @GET("Usuarios/")
    suspend fun  listAllUsuarios()
    : RemoteResultUsuarios
}