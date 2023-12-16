package com.example.aaa.API.Data.MateriasPrimas.GET.ById

import com.example.aaa.API.Data.MateriasPrimas.GET.Model.Lista
import com.example.aaa.API.Data.MateriasPrimas.GET.Model.RemoteResultMateriasPrimas
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ConsumirApiMateriasPrimasId {

    @GET("MateriasPrimas/{Id_IngredienteBodega}")
    suspend fun listMateriaPrimaId(@Path("Id_IngredienteBodega") Id_IngredienteBodega:Int)
    : List<Lista>
}