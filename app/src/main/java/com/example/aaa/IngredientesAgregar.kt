package com.example.aaa

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Spinner
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope


import com.example.aaa.API.Data.CodigoUnidades.GET.AllCodigoUnidades.ClientAllCodigoUnidades
import com.example.aaa.API.Data.MateriasPrimas.POST.ClientPostMateriaPrima
import com.example.aaa.API.Data.MateriasPrimas.POST.ListPostMateriasPrimas

import com.example.aaa.API.FuncionesApi.DataHolder.idCodigoUnidad
import com.example.aaa.MyViewModel.MiViewModel

import kotlinx.coroutines.launch


class IngredientesAgregar : AppCompatActivity() {


    // Agrega más variables según sea necesario para otras propiedades
    private lateinit var nombreIngredientesAgregar: EditText
    private lateinit var existenciaAgregar: EditText
    private lateinit var tipoMedicionAgregar: EditText
    private lateinit var nombresUnidades: List<String>
    private lateinit var arrayAdapter: ArrayAdapter<String>
    private lateinit var idUnidades: List<*>
    private var unidadSeleccionada: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ingredientes_agregar)
        //editTextNombreUsuario = findViewById(R.id.textView2)
        //formularioUsuarios = findViewById(R.id.formularioUsuarios)
        val botonModificar = findViewById<ImageButton>(R.id.botonModificar)
        //editTextRutUsuario = findViewById(R.id.editTextRutUsuario)
        // Inicializa más variables según sea necesario para otras propiedades
        nombreIngredientesAgregar = findViewById(R.id.nombreIngredienteAgregar)
        existenciaAgregar=findViewById(R.id.existenciaAgregar)

        val existenciaEditText = findViewById<EditText>(R.id.existenciaAgregar)
        val existenciaString = existenciaEditText.text.toString()

// Convierte el valor de Existencia a un número entero

        //botonAgregar.setOnClickListener {
        // Muestra el formulario cuando se hace clic en el botón "Agregar"
        //formularioUsuarios.visibility = View.VISIBLE


        val serviceAllCodigoUnidades = ClientAllCodigoUnidades.makeAllCodigoUnidades()
        val activityContext = this




        val codUnidad=idCodigoUnidad

        lifecycleScope.launch {
            try {

                val consultaAllCodigoUnidades = serviceAllCodigoUnidades.listAllCodigoUnidades()
                val listaTodasUnidades: List<com.example.aaa.API.Data.CodigoUnidades.GET.Model.Lista> = consultaAllCodigoUnidades.lista
                println(listaTodasUnidades)
                    // Crear una lista de nombres a partir de la lista de unidades
                nombresUnidades = listaTodasUnidades.map { it.NombreUnidad }
                idUnidades=listaTodasUnidades.map{it.Id_Codigo}
                Log.d("Spinner", "Tamaño de la lista de nombres: ${nombresUnidades.size}")


                    // Crear un adaptador para el Spinner
                arrayAdapter = ArrayAdapter(this@IngredientesAgregar, android.R.layout.simple_spinner_item, nombresUnidades)

                    // Especificar el diseño para las opciones del Spinner
                arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

                    // Obtener la referencia del Spinner desde el diseño
                val spinner = findViewById<Spinner>(R.id.spinner)

                    // Asociar el adaptador con el Spinner
                spinner.adapter = arrayAdapter
                Log.d("Spinner", "Tamaño de la lista de nombres: ${nombresUnidades.size}")

                    // Manejar eventos de selección si es necesario
                spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
                    override fun onItemSelected(parentView: AdapterView<*>?, selectedItemView: View?, position: Int, id: Long) {
                            // Manejar la selección del usuario
                        val nombreSeleccionado = nombresUnidades[position]
                        val unidadSeleccionada = idUnidades[position]
                            // Puedes realizar acciones basadas en la selección
                        Log.d("Spinner", "Tamaño de la lista de nombres: ${nombresUnidades.size}")


                    }


                    override fun onNothingSelected(parentView: AdapterView<*>?) {
                            // Manejar el caso en que no se ha seleccionado nada
                    }
                }
                botonModificar.setOnClickListener {

                    lifecycleScope.launch {
                        try {


                            // Crear un objeto Lista con los datos del nuevo usuario
                            val nuevaMateriaPrima = ListPostMateriasPrimas(

                                NombreIngredienteBodega = nombreIngredientesAgregar.toString(),
                                Existencia = existenciaAgregar.text.toString().toInt(),
                                CodigoUnidad = unidadSeleccionada.toInt()
                            )


                            // Realizar la solicitud POST para crear el nuevo usuario
                            println(nuevaMateriaPrima)
                            val resultadoPost = ClientPostMateriaPrima.createMateriaPrima(nuevaMateriaPrima)
                            println(resultadoPost)

                        } catch (e: Exception) {
                            // Manejar cualquier excepción que pueda ocurrir durante la solicitud POST
                            e.printStackTrace()
                            println("Error al realizar la solicitud POST: ${e.message}")
                        }
                    }

                    Toast.makeText(this@IngredientesAgregar, "Se agregó Ingrediente", Toast.LENGTH_SHORT).show()
                   limpiarFormulario()


                }

                    // Resto del código...
            } catch (e: Exception) {
                    // Manejar cualquier excepción que pueda ocurrir durante la solicitud POST
                e.printStackTrace()
                println("Error al realizar la solicitud POST: ${e.message}")
            }
        }
    }
    private fun mostrarMensajeNotificaciones() {
        // Puedes mostrar un mensaje usando un AlertDialog o un Toast
        // En este ejemplo, se utiliza Toast para mostrar un mensaje efímero.
        Toast.makeText(this, "No hay notificaciones pendientes", Toast.LENGTH_SHORT).show()
    }

    private fun limpiarFormulario() {
        // Limpia las entradas del formulario
        nombreIngredientesAgregar.text.clear()
        existenciaAgregar.text.clear()
        // Limpia más entradas según sea necesario para otras propiedades
    }
}