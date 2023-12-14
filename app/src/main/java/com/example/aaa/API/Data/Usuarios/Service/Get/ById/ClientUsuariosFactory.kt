package com.example.aaa.API.Data.Usuarios.Service.Get.ById

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ClientUsuariosIdFactory {
    fun makeClienteUsuariosId(): ConsumirApiUsuariosId {
        return Retrofit.Builder()
            .baseUrl("http://10.0.2.2:3000/")
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(ConsumirApiUsuariosId::class.java)
    }
}