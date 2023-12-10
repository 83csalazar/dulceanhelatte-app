package com.example.aaa.Data.MateriasPrimas.GET.AllMateriasPrimas

import com.example.aaa.Data.MateriasPrimas.GET.Model.RemoteResultMateriasPrimas
import retrofit2.http.GET

interface ConsumirApiAllMateriasPrimas {

    @GET("MateriasPrimas/")
    suspend fun listAllMateriasPrimas()
    : RemoteResultMateriasPrimas
}