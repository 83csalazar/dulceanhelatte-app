package com.example.myapplication.Data.Service.AllUsuarios

import com.example.aaa.API.Data.Usuarios.Service.Post.ListaPost
import retrofit2.http.Body
import retrofit2.http.POST

interface PostUsuario {



    @POST("Usuarios/agregar/")
    suspend fun createUsuario(@Body nuevoUsuario: ListaPost)
}
