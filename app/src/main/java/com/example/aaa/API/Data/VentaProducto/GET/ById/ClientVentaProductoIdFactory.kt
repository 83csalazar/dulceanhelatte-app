package com.example.aaa.API.Data.VentaProducto.GET.ById

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ClientVentaProductoIdFactory {
    fun makeVentaProductoId(): ConsumirApiVentaProductoId {
        return Retrofit.Builder()
            .baseUrl("https://noha.cl/app/")
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(ConsumirApiVentaProductoId::class.java)
    }

}