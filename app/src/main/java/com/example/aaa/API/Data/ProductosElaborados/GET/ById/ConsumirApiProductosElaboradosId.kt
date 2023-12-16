package com.example.aaa.API.Data.ProductosElaborados.GET.ById

import com.example.aaa.API.Data.ProductosElaborados.GET.Model.Lista
import com.example.aaa.API.Data.ProductosElaborados.GET.Model.RemoteResultProductosELaborados
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ConsumirApiProductosElaboradosId {

    @GET("ProductosElaborados/{Id_Producto}")
    suspend fun  listProductosElaboradosId(@Path("Id_Producto") Id_Producto:Int)
    :List<Lista>
}