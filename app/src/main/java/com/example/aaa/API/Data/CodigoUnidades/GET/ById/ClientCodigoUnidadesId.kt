package com.example.aaa.API.Data.CodigoUnidades.GET.ById

import com.google.gson.Gson
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ClientCodigoUnidadesId {
    fun makeCodigoUnidadesId(): ConsumirApiCodigoUnidadesId {
        return Retrofit.Builder()
            .baseUrl("http://10.0.2.2:3000/")
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(ConsumirApiCodigoUnidadesId::class.java)
    }
}