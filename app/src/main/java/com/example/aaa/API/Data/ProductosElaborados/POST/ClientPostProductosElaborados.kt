package com.example.aaa.API.Data.ProductosElaborados.POST

import com.google.gson.Gson
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ClientPostProductosElaborados {
    fun makePostProductosElaborados():PostProductoElaborado{
        return Retrofit.Builder()
            .baseUrl("https://noha.cl/app/")
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(PostProductoElaborado::class.java)
    }
    suspend fun createProductoElaborado(nuevoProductosElaborados: ListaPostProductosElaborados){
        val service= makePostProductosElaborados()
        return service.createProductoElaborado(nuevoProductosElaborados)
    }
}