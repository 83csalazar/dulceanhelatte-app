package com.example.aaa.API.Data.Recetas.GET.ById

import com.example.aaa.API.Data.Recetas.GET.Model.Lista
import com.example.aaa.API.Data.Recetas.GET.Model.RemoteResultRecetas
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ConsumirApiRecetasId {

    @GET("Recetas/{Id_Receta}")
    suspend fun listRecetaId(@Path("Id_Receta") Id_Receta:Int)
    : List<Lista>
}