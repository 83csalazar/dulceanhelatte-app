package com.example.aaa.API.Data.CodigoUnidades.GET.AllCodigoUnidades

import com.example.aaa.API.Data.CodigoUnidades.GET.Model.RemoteResultCodigoUnidades
import retrofit2.http.GET

interface ConsumirApiAllCodigoUnidades {

    @GET("CodigoUnidades/")
    suspend fun listAllCodigoUnidades()
    : RemoteResultCodigoUnidades
}