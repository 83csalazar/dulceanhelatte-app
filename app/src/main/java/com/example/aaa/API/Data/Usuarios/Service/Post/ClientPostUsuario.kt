package com.example.aaa.API.Data.Usuarios.Service.Post

import com.example.myapplication.Data.Service.AllUsuarios.PostUsuario

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ClientPostUsuario {
    fun makePostUsuario(): PostUsuario {
        return Retrofit.Builder()
            .baseUrl("https://noha.cl/app/")
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(PostUsuario::class.java)
    }
    suspend fun createUsuario(nuevoUsuario: ListaPost) {
        val service = makePostUsuario()
        return service.createUsuario(nuevoUsuario)
    }
}