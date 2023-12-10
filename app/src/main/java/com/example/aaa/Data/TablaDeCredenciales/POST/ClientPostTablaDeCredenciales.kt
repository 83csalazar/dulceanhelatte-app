package com.example.aaa.Data.TablaDeCredenciales.POST

import com.google.gson.Gson
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.nio.file.attribute.AclEntry.Builder

object ClientPostTablaDeCredenciales {
    fun makePostTablaDeCredenciales():PostTablaDeCredenciales{
        return Retrofit.Builder()
            .baseUrl("http://10.0.2.2:3000")
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(PostTablaDeCredenciales::class.java)
    }
}