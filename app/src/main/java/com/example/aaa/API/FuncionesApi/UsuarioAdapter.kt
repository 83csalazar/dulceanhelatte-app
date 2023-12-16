package com.example.aaa.API.FuncionesApi

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.aaa.API.Data.Usuarios.Service.Get.Model.Lista
import com.example.aaa.R


class UsuarioAdapter(private val listaUsuarios: List<Lista>) :
    RecyclerView.Adapter<UsuarioAdapter.UsuarioViewHolder>() {

    class UsuarioViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val nombreTextView: TextView = itemView.findViewById(R.id.nombreTextView) ?: throw NullPointerException("nombreTextView is null")
        val rutTextView: TextView = itemView.findViewById(R.id.rutTextView) ?: throw NullPointerException("rutTextView is null")
        val digVerificadorTextView: TextView = itemView.findViewById(R.id.digVerificadorTextView) ?: throw NullPointerException("digVerificadorTextView is null")
        val tipoUsuarioTextView: TextView = itemView.findViewById(R.id.tipoUsuarioTextView) ?: throw NullPointerException("tipoUsuarioTextView is null")
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UsuarioViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_usuario, parent, false)
        return UsuarioViewHolder(itemView)
    }



    override fun onBindViewHolder(holder: UsuarioViewHolder, position: Int) {
        val usuario = listaUsuarios[position]
        holder.nombreTextView.text = usuario.Nombre
        holder.rutTextView.text = "RUT: ${usuario.Rut}"
        holder.digVerificadorTextView.text = "Dígito Verificador: ${usuario.DigVerificador}"
        holder.tipoUsuarioTextView.text = "Tipo de Usuario: ${usuario.TipoUsuario}"
    }

    override fun getItemCount(): Int {
        return listaUsuarios.size
    }
}
