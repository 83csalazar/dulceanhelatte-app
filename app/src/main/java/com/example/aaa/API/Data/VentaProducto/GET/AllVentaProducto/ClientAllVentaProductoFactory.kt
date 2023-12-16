package com.example.aaa.API.Data.VentaProducto.GET.AllVentaProducto

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object ClientAllVentaProductoFactory {
    fun makeAllVentaProducto(): ConsumirApiAllVentaProducto {
        return Retrofit.Builder()
            .baseUrl("https://noha.cl/app/")
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(ConsumirApiAllVentaProducto::class.java)

    }
}