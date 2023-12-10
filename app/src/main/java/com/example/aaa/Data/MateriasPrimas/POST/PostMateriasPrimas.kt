package com.example.aaa.Data.MateriasPrimas.POST

import retrofit2.http.Body
import retrofit2.http.POST

interface PostMateriasPrimas {

    @POST("MateriasPrimas/agregar/")
    suspend fun createMateriaPrima(@Body nuevaMateriasPrimas: ListPostMateriasPrimas)
}