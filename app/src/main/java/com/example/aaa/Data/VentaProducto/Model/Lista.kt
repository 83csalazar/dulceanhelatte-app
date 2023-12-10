package com.example.aaa.Data.VentaProducto.Model

data class Lista(
    val Cantidad: Int,
    val Fecha: String,
    val Id_Cliente: String,
    val Id_Producto: Int,
    val Id_Usuario: Int,
    val Id_Venta: Int,
    val TipoDePago: String,
    val Total: Int
)