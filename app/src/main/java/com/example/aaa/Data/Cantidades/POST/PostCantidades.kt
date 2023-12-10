package com.example.aaa.Data.Cantidades.POST

import retrofit2.http.Body
import retrofit2.http.GET

interface PostCantidades {

    @GET("Cantidades/")
    suspend fun createCantidades(@Body nuevaCantidades: ListPostCantidades)
}