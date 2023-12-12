package com.example.aaa.API.Data.TablaDeCredenciales.GET.ById

import com.example.aaa.API.Data.TablaDeCredenciales.GET.Model.RemoteResultTablaDeCredenciales
import retrofit2.http.GET
import retrofit2.http.Query

interface ConsumirApiTablaDeCredencialesId {
    @GET("TablaDeCredenciales/")
    suspend fun listTablaDeCredencialId
                (@Query("Id_Usuario") Id_Usuario:Int)
    : RemoteResultTablaDeCredenciales
}