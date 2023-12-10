package com.example.aaa.Data.Recetas.GET.ById

import com.example.aaa.Data.Recetas.GET.Model.RemoteResultRecetas
import retrofit2.http.GET
import retrofit2.http.Query

interface ConsumirApiRecetasId {

    @GET("Recetas/")
    suspend fun listRecetaId(@Query("Id_Receta") Id_Receta:Int)
    : RemoteResultRecetas
}