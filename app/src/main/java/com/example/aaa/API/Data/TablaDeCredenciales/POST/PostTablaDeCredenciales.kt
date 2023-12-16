package com.example.aaa.API.Data.TablaDeCredenciales.POST

import retrofit2.http.Body
import retrofit2.http.POST

interface PostTablaDeCredenciales {

    @POST("TablaDeCredenciales/agregar/")
    suspend fun createCredenciales(@Body nuevaCredenciales: ListaPostTablaDeCredenciales)
}