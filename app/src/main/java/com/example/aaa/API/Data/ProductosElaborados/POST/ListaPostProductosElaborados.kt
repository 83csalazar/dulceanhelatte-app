package com.example.aaa.API.Data.ProductosElaborados.POST

import android.widget.EditText

data class ListaPostProductosElaborados(
    val Id_Producto: Int,
    val NombreProducto: EditText,
    val Precio: Int,
    val Receta: Int
)
