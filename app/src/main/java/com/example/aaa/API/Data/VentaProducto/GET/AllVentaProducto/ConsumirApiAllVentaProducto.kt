package com.example.aaa.API.Data.VentaProducto.GET.AllVentaProducto

import com.example.aaa.API.Data.VentaProducto.GET.Model.RemoteResultVentaProducto
import retrofit2.http.GET

interface ConsumirApiAllVentaProducto {

    @GET("Clientes/")
    suspend fun listAllVentaProducto()
    : RemoteResultVentaProducto
}