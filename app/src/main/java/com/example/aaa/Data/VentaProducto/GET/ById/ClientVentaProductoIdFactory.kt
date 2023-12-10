package com.example.aaa.Data.VentaProducto.GET.ById

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ClientVentaProductoIdFactory {
    fun makeVentaProductoId(): ConsumirApiVentaProductoId {
        return Retrofit.Builder()
            .baseUrl("http://10.0.2.2:3000")
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(ConsumirApiVentaProductoId::class.java)
    }

}