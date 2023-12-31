package com.example.aaa.Data.TipoUsuarios.GET.ById

import com.google.gson.Gson
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ClientTipoUsuariosId {
    fun makeTipoUsuariosId(): ConsumirApiTipoUsuariosId {
        return Retrofit.Builder()
            .baseUrl("http://10.0.2.2:3000")
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(ConsumirApiTipoUsuariosId::class.java)
    }
}