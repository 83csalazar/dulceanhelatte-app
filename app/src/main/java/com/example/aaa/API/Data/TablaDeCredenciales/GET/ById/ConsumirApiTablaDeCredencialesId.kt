package com.example.aaa.API.Data.TablaDeCredenciales.GET.ById

import com.example.aaa.API.Data.TablaDeCredenciales.GET.Model.Lista
import com.example.aaa.API.Data.TablaDeCredenciales.GET.Model.RemoteResultTablaDeCredenciales
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ConsumirApiTablaDeCredencialesId {
    @GET("TablaDeCredenciales/{Id_Usuario}")
    suspend fun listTablaDeCredencialId
                (@Path("Id_Usuario") Id_Usuario:Int)
    : List<Lista>
}