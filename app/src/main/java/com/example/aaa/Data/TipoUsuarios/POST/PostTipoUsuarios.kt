package com.example.aaa.Data.TipoUsuarios.POST

import retrofit2.http.Body
import retrofit2.http.POST

interface PostTipoUsuarios {

    @POST("TipoUsuarios/")
    suspend fun createTipoUsuarios(@Body nuevoTipoUsuarios: ListPostTipoUsuarios)
}