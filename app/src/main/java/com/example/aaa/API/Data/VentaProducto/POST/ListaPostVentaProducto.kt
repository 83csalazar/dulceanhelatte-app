package com.example.aaa.API.Data.VentaProducto.POST

data class ListaPostVentaProducto(

    val Id_Producto: Int,

    val Fecha: String,
    val Cantidad: Int,
    val Total: Int,
    val TipoDePago: String,
    val Id_Usuario: Int,
    val Id_Cliente: String

)
