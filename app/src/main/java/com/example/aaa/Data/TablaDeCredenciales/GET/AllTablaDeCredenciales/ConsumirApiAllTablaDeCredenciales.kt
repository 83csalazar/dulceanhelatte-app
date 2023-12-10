package com.example.aaa.Data.TablaDeCredenciales.GET.AllTablaDeCredenciales

import com.example.aaa.Data.TablaDeCredenciales.GET.Model.RemoteResultTablaDeCredenciales
import retrofit2.http.GET

interface ConsumirApiAllTablaDeCredenciales {

    @GET("TablaDeCredenciales/")
    suspend fun listAllTablaDeCredenciales()
    : RemoteResultTablaDeCredenciales
}