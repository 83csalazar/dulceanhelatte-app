package com.example.aaa.API.FuncionesApi;

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.aaa.API.Data.CodigoUnidades.GET.ById.ClientCodigoUnidadesId
import com.example.aaa.API.Data.CodigoUnidades.GET.ById.ConsumirApiCodigoUnidadesId

import com.example.aaa.API.Data.MateriasPrimas.GET.Model.Lista
import com.example.aaa.R
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MateriasPrimasAdapter(private val materiasPrimasList: List<Lista>) :
        RecyclerView.Adapter<MateriasPrimasAdapter.MateriasPrimasViewHolder>() {

        private val apiService: ConsumirApiCodigoUnidadesId = ClientCodigoUnidadesId.makeCodigoUnidadesId()

        class MateriasPrimasViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
                val nombreIngrediente: TextView = itemView.findViewById(R.id.textViewNombreIngrediente)
                val existencia: TextView = itemView.findViewById(R.id.textViewExistencia)
                val codigoUnidad: TextView = itemView.findViewById(R.id.textViewTipoUnidad)
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MateriasPrimasViewHolder {
                val itemView = LayoutInflater.from(parent.context)
                        .inflate(R.layout.item_materia_prima, parent, false)
                return MateriasPrimasViewHolder(itemView)
        }

        override fun onBindViewHolder(holder: MateriasPrimasViewHolder, position: Int) {
                val materiaPrima = materiasPrimasList[position]
                holder.nombreIngrediente.text = materiaPrima.NombreIngredienteBodega
                holder.existencia.text = "Existencia: ${materiaPrima.Existencia}"

                // Llamada a la API dentro de un CoroutineScope
                CoroutineScope(Dispatchers.IO).launch {
                        try {
                                // Realiza la llamada a la API para obtener información sobre la unidad
                                val result: List<com.example.aaa.API.Data.CodigoUnidades.GET.Model.Lista> = apiService.listCodigoUnidadesId(materiaPrima.CodigoUnidad)

                                // Actualiza la interfaz de usuario en el hilo principal
                                withContext(Dispatchers.Main) {
                                        if (result.isNotEmpty()) {
                                                val codigoUnidad = result[0].NombreUnidad // Ajusta esto según la estructura de tu respuesta
                                                holder.codigoUnidad.text = "Tipo Unidad: $codigoUnidad"
                                                val idCodigoUnidad = result[0].Id_Codigo
                                                DataHolder.idCodigoUnidad = idCodigoUnidad.toString()
                                        } else {
                                                // Manejar el caso en que la lista de unidades esté vacía
                                        }
                                }
                        } catch (e: Exception) {
                                // Maneja cualquier error que pueda ocurrir durante la llamada a la API
                        }
                }
        }

        override fun getItemCount(): Int {
                return materiasPrimasList.size
        }
}