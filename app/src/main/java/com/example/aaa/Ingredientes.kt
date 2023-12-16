package com.example.aaa

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import com.example.aaa.API.Data.MateriasPrimas.GET.AllMateriasPrimas.ClientAllMateriasPrimas
import com.example.aaa.API.Data.MateriasPrimas.GET.AllMateriasPrimas.ConsumirApiAllMateriasPrimas
import com.example.aaa.API.Data.MateriasPrimas.GET.ById.ClientMateriasPrimasIdFactory
import com.example.aaa.API.Data.MateriasPrimas.GET.ById.ConsumirApiMateriasPrimasId
import com.example.aaa.API.Data.MateriasPrimas.GET.Model.Lista
import com.example.aaa.API.FuncionesApi.MateriasPrimasAdapter
import kotlinx.coroutines.launch

class Ingredientes : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    //-private lateinit var ingredienteAdapter: IngredienteAdapter // Ajusta el nombre del adaptador según tu implementación

    private lateinit var materiasPrimasAdapter: MateriasPrimasAdapter
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ingredientes)

        // Obtén referencias a los elementos de la interfaz de usuario
        val botonAgregar = findViewById<ImageButton>(R.id.botonAgregar)
        val botonEliminar = findViewById<ImageButton>(R.id.botonEliminar)
        val botonModificar = findViewById<ImageButton>(R.id.botonModificar)
        val btnhome = findViewById<View>(R.id.buttonHome)
        val smallButtonImageView = findViewById<ImageView>(R.id.id_notificaciones)

        // Configura el RecyclerView

        val serviceAllMateriasPrimas=ClientAllMateriasPrimas.makeAllMateriasPrimas()
        val activityContext = this

        lifecycleScope.launch {
            try {
                // Aquí proporciona el valor que deseas para Id_Codigo
                val consultaAllMateriasPrimas=serviceAllMateriasPrimas.listAllMateriasPrimas()
                val listaMateriasPrimas:List<Lista> = consultaAllMateriasPrimas.lista


                // Configurar el RecyclerView
                recyclerView = findViewById(R.id.recyclerViewIngredientes)
                recyclerView.layoutManager = LinearLayoutManager(activityContext)

                // Usar el adaptador personalizado
                materiasPrimasAdapter = MateriasPrimasAdapter(listaMateriasPrimas)
                recyclerView.adapter = materiasPrimasAdapter

            } catch (e: Exception) {
                // Manejar errores
                e.printStackTrace()
            }
        }

        // Configura el botón Agregar
        botonAgregar.setOnClickListener {
            val intent = Intent(this, IngredientesAgregar::class.java)
            startActivity(intent)
        }

        // Configura el botón Eliminar
        botonEliminar.setOnClickListener {
            // Aquí debes implementar la lógica para eliminar un ingrediente de la base de datos
            // Luego, actualiza el RecyclerView
            // Por ejemplo:
            // ingredienteAdapter.eliminarIngrediente(ingredienteAEliminar)
        }

        // Configura el botón Modificar
        botonModificar.setOnClickListener {
            // Aquí debes implementar la lógica para modificar un ingrediente en la base de datos
            // Luego, actualiza el RecyclerView
            // Por ejemplo:
            // ingredienteAdapter.modificarIngrediente(ingredienteModificado)
        }
        // Configurar el OnClickListener para el botón Home
        btnhome.setOnClickListener {
            // Crear un Intent para volver a la actividad MenuPrincipal
            val intent = Intent(this@Ingredientes, MenuPrincipal::class.java)
            startActivity(intent)

            // Finalizar la actividad actual (Facturas)
            finish()
        }
        // Configurar OnClickListener para el botón de notificaciones
        smallButtonImageView.setOnClickListener {
            mostrarMensajeNotificaciones()
        }

        // Aquí puedes realizar otras configuraciones adicionales según tus necesidades
        // Por ejemplo, configurar los listeners de los demás botones, cambiar el texto de las vistas, etc.
    }

    private fun mostrarMensajeNotificaciones() {
        // Puedes mostrar un mensaje usando un AlertDialog o un Toast
        // En este ejemplo, se utiliza Toast para mostrar un mensaje efímero.
        Toast.makeText(this, "No hay notificaciones pendientes", Toast.LENGTH_SHORT).show()
    }
}
