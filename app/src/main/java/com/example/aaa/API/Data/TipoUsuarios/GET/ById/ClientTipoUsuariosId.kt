package com.example.aaa.API.Data.TipoUsuarios.GET.ById

import com.google.gson.Gson
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ClientTipoUsuariosId {
    fun makeTipoUsuariosId(): ConsumirApiTipoUsuariosId {
        return Retrofit.Builder()
            .baseUrl("https://noha.cl/app/")
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(ConsumirApiTipoUsuariosId::class.java)
    }
}