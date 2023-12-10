package com.example.aaa.Data.ProductosElaborados.POST

import com.google.gson.Gson
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ClientPostProductosElaborados {
    fun makePostProductosElaborados():PostProductoElaborado{
        return Retrofit.Builder()
            .baseUrl("http://10.0.2.2:3000/")
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(PostProductoElaborado::class.java)
    }
    suspend fun createProductoElaborado(nuevoProductosElaborados: ListaPostProductosElaborados){
        val service= makePostProductosElaborados()
        return service.createProductoElaborado(nuevoProductosElaborados)
    }
}