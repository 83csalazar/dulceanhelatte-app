package com.example.aaa.API.Data.TipoUsuarios.POST

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ClientPostTipoUsuarios {
    fun makePostTipoUsuarios():PostTipoUsuarios{
        return Retrofit.Builder()
            .baseUrl("https://noha.cl/app/")
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(PostTipoUsuarios::class.java)
    }
    suspend fun createTipoUsuarios(nuevoTipoUsuarios: ListPostTipoUsuarios){
        val service= makePostTipoUsuarios()
        return service.createTipoUsuarios(nuevoTipoUsuarios)
    }
}