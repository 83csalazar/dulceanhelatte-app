package com.example.aaa.Data.VentaProducto.GET.AllVentaProducto

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object ClientAllVentaProductoFactory {
    fun makeAllVentaProducto(): ConsumirApiAllVentaProducto {
        return Retrofit.Builder()
            .baseUrl("http://10.0.2.2:3000")
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(ConsumirApiAllVentaProducto::class.java)

    }
}