package com.example.aaa.Data.ProductosElaborados.GET.AllProductosElaborados

import com.example.aaa.Data.ProductosElaborados.GET.Model.RemoteResultProductosELaborados
import retrofit2.http.GET

interface ConsumirApiAllProductosElaborados {

    @GET("ProductosElaborados/")
    suspend fun listAllProductosElaborados()
    : RemoteResultProductosELaborados
}