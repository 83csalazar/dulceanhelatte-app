package com.example.aaa.API.Data.CodigoUnidades.POST

import retrofit2.http.Body
import retrofit2.http.POST

interface PostCodigoUnidades {

    @POST("CodigoUnidades/")
    suspend fun createCodigo(@Body nuevoCodigo: ListPostCodigoUnidades)
}