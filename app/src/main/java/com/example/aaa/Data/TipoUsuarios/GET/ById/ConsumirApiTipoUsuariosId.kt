package com.example.aaa.Data.TipoUsuarios.GET.ById

import com.example.aaa.Data.TipoUsuarios.GET.Model.RemoteResultTipoUsuarios
import retrofit2.http.GET
import retrofit2.http.Query

interface ConsumirApiTipoUsuariosId {

    @GET("TipoUsuarios/")
    suspend fun listTipoUsuariosId
                (@Query("Id_TipoUsuario") Id_TipoUsuario:Int)
    : RemoteResultTipoUsuarios
}