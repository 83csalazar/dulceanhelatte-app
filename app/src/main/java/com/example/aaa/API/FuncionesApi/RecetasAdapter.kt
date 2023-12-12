package com.example.aaa.API.FuncionesApi;

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.aaa.API.Data.Recetas.GET.Model.Lista
import com.example.aaa.R

// RecetasAdapter.kt
// RecetasAdapter.kt

class RecetasAdapter(private val listaRecetas: List<Lista>) :
        RecyclerView.Adapter<RecetasAdapter.RecetaViewHolder>() {

    class RecetaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        // ViewHolder con referencias a los elementos de la interfaz de usuario
        val nombreRecetaTextView: TextView = itemView.findViewById(R.id.nombreRecetaTextView)
        val ingredientesTextView: TextView = itemView.findViewById(R.id.ingredientesTextView)
        // Agrega más referencias según sea necesario
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecetaViewHolder {
        // Infla el diseño del elemento de la lista y devuelve el ViewHolder
        val itemView = LayoutInflater.from(parent.context)
        .inflate(R.layout.item_recetas, parent, false)
        return RecetaViewHolder(itemView)
        }

        override fun onBindViewHolder(holder: RecetaViewHolder, position: Int) {
        // Vincula los datos en la posición dada con los elementos de la interfaz de usuario
        val receta = listaRecetas[position]
        holder.nombreRecetaTextView.text = receta.NombreReceta
        // Vincula más datos según sea necesario
        }

        override fun getItemCount(): Int {
        // Devuelve la cantidad de elementos en la lista
        return listaRecetas.size
        }
        }