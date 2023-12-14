package com.example.aaa.API.Data.CodigoUnidades.GET.ById

import com.example.aaa.API.Data.CodigoUnidades.GET.Model.Lista
import com.example.aaa.API.Data.CodigoUnidades.GET.Model.RemoteResultCodigoUnidades
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ConsumirApiCodigoUnidadesId {
    @GET("CodigoUnidades/{Id_Codigo}")
    suspend fun listCodigoUnidadesId(@Path("Id_Codigo") Id_Codigo: Int)
    :List<Lista>


}