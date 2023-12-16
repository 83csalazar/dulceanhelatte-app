package com.example.aaa.API.Data.VentaProducto.POST

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ClientPostVentaProducto {
    fun makePostVentaProducto(): PostVentaProducto {
        return Retrofit.Builder()
            .baseUrl("https://noha.cl/app/")
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(PostVentaProducto::class.java)

    }
    suspend fun createVentaProducto(nuevaVentaProducto: ListaPostVentaProducto){
        val service = makePostVentaProducto()
        return service.createVentaProducto(nuevaVentaProducto)
    }
}