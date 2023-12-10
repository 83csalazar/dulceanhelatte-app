package com.example.aaa.Data.TipoUsuarios.GET.AllTipoUsuarios

import com.example.aaa.Data.TipoUsuarios.GET.Model.RemoteResultTipoUsuarios
import retrofit2.http.GET

interface ConsumirAllTipoUsuarios {

    @GET("TipoUsuarios/")
    suspend fun listAllTipoUsuarios()
    : RemoteResultTipoUsuarios
}