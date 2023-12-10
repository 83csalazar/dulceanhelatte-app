package com.example.aaa.Data.Recetas.GET.AllRecetas

import com.example.aaa.Data.Recetas.GET.Model.RemoteResultRecetas
import retrofit2.http.GET

interface ConsumirApiAllRecetas {

    @GET("Recetas/")
    suspend fun listAllRecetas()
    : RemoteResultRecetas
}