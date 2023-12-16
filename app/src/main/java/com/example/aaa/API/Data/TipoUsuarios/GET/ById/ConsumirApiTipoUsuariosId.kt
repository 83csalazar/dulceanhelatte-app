package com.example.aaa.API.Data.TipoUsuarios.GET.ById

import com.example.aaa.API.Data.TipoUsuarios.GET.Model.Lista
import com.example.aaa.API.Data.TipoUsuarios.GET.Model.RemoteResultTipoUsuarios
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ConsumirApiTipoUsuariosId {

    @GET("TipoUsuarios/{Id_TipoUsuario}")
    suspend fun listTipoUsuariosId
                (@Path("Id_TipoUsuario") Id_TipoUsuario:Int)
    : List<Lista>
}