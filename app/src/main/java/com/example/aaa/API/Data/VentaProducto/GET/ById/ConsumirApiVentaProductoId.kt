package com.example.aaa.API.Data.VentaProducto.GET.ById

import com.example.aaa.API.Data.VentaProducto.GET.Model.Lista
import com.example.aaa.API.Data.VentaProducto.GET.Model.RemoteResultVentaProducto
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ConsumirApiVentaProductoId {

    @GET("VentaProducto/{Id_Venta}")
    suspend fun listVentaId(@Path("Id_Venta") Id_Cliente:Int)
    : List<Lista>
}