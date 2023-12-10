package com.example.aaa.Data.CodigoUnidades.GET.ById

import com.example.aaa.Data.CodigoUnidades.GET.Model.RemoteResultCodigoUnidades
import retrofit2.http.GET
import retrofit2.http.Query

interface ConsumirApiCodigoUnidadesId {

    @GET("CodigoUnidades/")
    suspend fun  listCodigoUnidadesId
                (@Query("Id_Codigo") Id_Codigo:Int)
    : RemoteResultCodigoUnidades
}