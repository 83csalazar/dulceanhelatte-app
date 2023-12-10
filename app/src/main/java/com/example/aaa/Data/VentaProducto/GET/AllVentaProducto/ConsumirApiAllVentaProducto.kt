package com.example.aaa.Data.VentaProducto.GET.AllVentaProducto

import com.example.aaa.Data.VentaProducto.Model.RemoteResultVentaProducto
import retrofit2.http.GET

interface ConsumirApiAllVentaProducto {

    @GET("Clientes/")
    suspend fun listAllVentaProducto()
    :RemoteResultVentaProducto
}