package com.example.aaa.API.Data.VentaProducto.GET.ById

import com.example.aaa.API.Data.VentaProducto.GET.Model.RemoteResultVentaProducto
import retrofit2.http.GET
import retrofit2.http.Query

interface ConsumirApiVentaProductoId {

    @GET("VentaProducto/")
    suspend fun listVentaId(@Query("Id_Venta") Id_Cliente:Int)
    : RemoteResultVentaProducto
}