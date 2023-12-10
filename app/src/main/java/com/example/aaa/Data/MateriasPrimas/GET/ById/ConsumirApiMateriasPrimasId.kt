package com.example.aaa.Data.MateriasPrimas.GET.ById

import com.example.aaa.Data.MateriasPrimas.GET.Model.RemoteResultMateriasPrimas
import retrofit2.http.GET
import retrofit2.http.Query

interface ConsumirApiMateriasPrimasId {

    @GET("MateriasPrimas/")
    suspend fun listMateriaPrimaId(@Query("Id_IngredienteBodega") Id_IngredienteBodega:Int)
    : RemoteResultMateriasPrimas
}