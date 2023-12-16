package com.example.aaa.API.Data.Cantidades.GET.ById

import com.example.aaa.API.Data.CodigoUnidades.GET.Model.Lista
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ConsumirApiCantidadesId {
    @GET("Cantidades/{Id_Cantidades}")
    suspend fun listCantidadesId(@Path("Id_Cantidades")Id_Cantidades:Int)
    : List<com.example.aaa.API.Data.Cantidades.GET.Model.Lista>
}
