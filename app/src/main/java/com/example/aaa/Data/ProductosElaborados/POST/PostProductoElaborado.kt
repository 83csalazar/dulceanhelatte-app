package com.example.aaa.Data.ProductosElaborados.POST

import retrofit2.http.Body
import retrofit2.http.POST

interface PostProductoElaborado {

    @POST("ProductosElaborados/agregar/")
    suspend fun createProductoElaborado(@Body nuevoProductosElaborados: ListaPostProductosElaborados)
}