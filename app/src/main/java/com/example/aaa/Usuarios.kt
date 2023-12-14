package com.example.aaa

import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.lifecycle.lifecycleScope
import com.example.aaa.API.Data.Usuarios.Service.Get.Model.Lista
import com.example.aaa.API.FuncionesApi.UsuarioAdapter
import com.example.myapplication.Data.Service.AllUsuarios.ClientAllUsuariosFactory
import kotlinx.coroutines.launch

class Usuarios : AppCompatActivity() {

    //-private val databaseHelper: DatabaseHelper = DatabaseHelper(this)
    //-private lateinit var recyclerView: RecyclerView
    //-private lateinit var usuarioAdapter: UsuarioAdapter // Ajusta el nombre del adaptador según tu implementación
    private lateinit var recyclerView: RecyclerView
    private lateinit var usuarioAdapter: UsuarioAdapter
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_usuarios)

        // Obtén referencias a los elementos de la interfaz de usuario
        val botonAgregar = findViewById<ImageButton>(R.id.botonAgregar)
        val botonEliminar = findViewById<ImageButton>(R.id.botonEliminar)
        val botonModificar = findViewById<ImageButton>(R.id.botonModificar)
        val btnhome = findViewById<View>(R.id.buttonHome)
        val smallButtonImageView = findViewById<ImageView>(R.id.id_notificaciones)

        val serviceAllUsuarios = ClientAllUsuariosFactory.makeClienteAllUsuarios()
        val activityContext = this
        lifecycleScope.launch {
            try {
                val consultaAllUsers = serviceAllUsuarios.listAllUsuarios()
                val listaUsuarios: List<Lista> = consultaAllUsers.lista

                recyclerView = findViewById(R.id.recyclerViewUsuarios)
                recyclerView.layoutManager = LinearLayoutManager(activityContext)
                usuarioAdapter = UsuarioAdapter(listaUsuarios)
                recyclerView.adapter = usuarioAdapter
                println(listaUsuarios)
            } catch (e: Exception) {
                // Manejar errores
                e.printStackTrace()
            }
        }

        // Configura el botón Agregar
        botonAgregar.setOnClickListener {
            // Aquí debes implementar la lógica para agregar un usuario a la base de datos
            // Luego, actualiza el RecyclerView
            // Por ejemplo:
            // databaseHelper.agregarUsuario(nuevoUsuario)
            // usuarioAdapter.actualizarDatos(databaseHelper.obtenerTodosLosUsuarios())
        }

        // Configura el botón Eliminar
        botonEliminar.setOnClickListener {
            // Aquí debes implementar la lógica para eliminar un usuario de la base de datos
            // Luego, actualiza el RecyclerView
            // Por ejemplo:
            // databaseHelper.eliminarUsuario(usuarioAEliminar)
            // usuarioAdapter.actualizarDatos(databaseHelper.obtenerTodosLosUsuarios())
        }

        // Configura el botón Modificar
        botonModificar.setOnClickListener {

        }
    }
}
