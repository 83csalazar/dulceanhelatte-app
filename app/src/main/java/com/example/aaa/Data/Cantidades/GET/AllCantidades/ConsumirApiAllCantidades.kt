package com.example.aaa.Data

import com.example.aaa.Data.Cantidades.GET.Model.RemoteResultCantidades
import retrofit2.http.GET

interface ConsumirApiAllCantidades {

    @GET("Cantidades/")
    suspend fun listAllCantidades()
    : RemoteResultCantidades
}