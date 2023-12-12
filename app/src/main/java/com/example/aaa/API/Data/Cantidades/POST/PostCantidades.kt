package com.example.aaa.API.Data.Cantidades.POST

import retrofit2.http.Body
import retrofit2.http.GET

interface PostCantidades {

    @GET("Cantidades/")
    suspend fun createCantidades(@Body nuevaCantidades: ListPostCantidades)
}