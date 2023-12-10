package com.example.aaa.Data.Cantidades.GET.ById

import com.example.aaa.Data.Cantidades.GET.Model.RemoteResultCantidades
import retrofit2.http.GET
import retrofit2.http.Query

interface ConsumirApiCantidadesId {
    @GET("Cantidades/")
    suspend fun listCantidadesId(@Query("Id_Cantidades")Id_Cantidades:Int)
    : RemoteResultCantidades
}