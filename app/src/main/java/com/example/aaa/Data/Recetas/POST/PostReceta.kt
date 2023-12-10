package com.example.aaa.Data.Recetas.POST

import retrofit2.http.Body
import retrofit2.http.POST

interface PostReceta {

    @POST("Recetas/agregar/")
    suspend fun createReceta(@Body nuevaReceta:ListaPostReceta)
}