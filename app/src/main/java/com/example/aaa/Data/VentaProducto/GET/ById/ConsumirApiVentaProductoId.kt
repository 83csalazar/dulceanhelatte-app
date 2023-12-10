package com.example.aaa.Data.VentaProducto.GET.ById

import com.example.aaa.Data.Clientes.Model.RemoteResultClientes
import com.example.aaa.Data.VentaProducto.GET.Model.RemoteResultVentaProducto
import retrofit2.http.GET
import retrofit2.http.Query

interface ConsumirApiVentaProductoId {

    @GET("VentaProducto/")
    suspend fun listVentaId(@Query("Id_Venta") Id_Cliente:Int)
    : RemoteResultVentaProducto
}