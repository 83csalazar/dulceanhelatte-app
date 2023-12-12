package com.example.aaa.API.Data.ProductosElaborados.GET.ById

import com.example.aaa.API.Data.ProductosElaborados.GET.Model.RemoteResultProductosELaborados
import retrofit2.http.GET
import retrofit2.http.Query

interface ConsumirApiProductosElaboradosId {

    @GET("ProductosElaborados/")
    suspend fun  listProductosElaboradosId(@Query("Id_Producto") Id_Producto:Int)
    : RemoteResultProductosELaborados
}