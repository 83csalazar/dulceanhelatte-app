package com.example.aaa.Data.VentaProducto.POST

import retrofit2.http.Body
import retrofit2.http.POST

interface PostVentaProducto {

    @POST("VentaProducto/agregar/")
    suspend fun createVentaProducto(@Body nuevaVentaProducto: ListaPostVentaProducto)
}