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

import kotlinx.coroutines.launch


class IngredientesAgregar : AppCompatActivity() {


    // Agrega más variables según sea necesario para otras propiedades
    private lateinit var nombreIngredientesAgregar: EditText
    private lateinit var existenciaAgregar: EditText
    private lateinit var tipoMedicionAgregar: EditText
    private lateinit var nombresUnidades: List<String>
    private lateinit var arrayAdapter: ArrayAdapter<String>
    private lateinit var idUnidades: List<*>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ingredientes_agregar)
        //editTextNombreUsuario = findViewById(R.id.textView2)
        //formularioUsuarios = findViewById(R.id.formularioUsuarios)
        val botonModificar = findViewById<ImageButton>(R.id.botonModificar)
        //editTextRutUsuario = findViewById(R.id.editTextRutUsuario)
        // Inicializa más variables según sea necesario para otras propiedades
        nombreIngredientesAgregar = findViewById(R.id.nombreIngredienteAgregar)


        //botonAgregar.setOnClickListener {
        // Muestra el formulario cuando se hace clic en el botón "Agregar"
        //formularioUsuarios.visibility = View.VISIBLE



            // Guarda la información cuando se hace clic en el botón "Guardar"
        //val nombreIngrediente = nombreIngredientesAgregar.text.toString()
        //val existenciaActual = existenciaAgregar.text.toString()
        //val tipoMedicion = tipoMedicionAgregar.text.toString()
            // Obtiene más información según sea necesario para otras propiedades

            // Aquí debes manejar la lógica para almacenar la información, por ejemplo, a través de una llamada a la API o en una base de datos local
            // ...

            // Limpia las entradas del formulario
            // limpiarFormulario()
            // Obtiene la lista de nombres desde el archivo de recursos

        val serviceAllCodigoUnidades = ClientAllCodigoUnidades.makeAllCodigoUnidades()
        val activityContext = this




        val codUnidad=idCodigoUnidad
            // Oculta el formulario después de guardar la información
            //formularioUsuarios.visibility = View.GONE
        lifecycleScope.launch {
            try {
                    // Realizar la llamada a la API para obtener la lista de unidades
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
                val unidadSeleccionada=0
                    // Manejar eventos de selección si es necesario
                spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
                    override fun onItemSelected(parentView: AdapterView<*>?, selectedItemView: View?, position: Int, id: Long) {
                            // Manejar la selección del usuario
                        val nombreSeleccionado = nombresUnidades[position]
                        val unidadSeleccionada = idUnidades[position]
                            // Puedes realizar acciones basadas en la selección
                        Log.d("Spinner", "Tamaño de la lista de nombres: ${nombresUnidades.size}")
                        println(unidadSeleccionada)
                        botonModificar.setOnClickListener {
                            lifecycleScope.launch {
                                try {
                                    // Crear un objeto Lista con los datos del nuevo usuario
                                    val nuevaMateriaPrima = ListPostMateriasPrimas(
                                        NombreIngredienteBodega = nombreIngredientesAgregar,
                                        Existencia = existenciaAgregar,
                                        CodigoUnidad = unidadSeleccionada
                                    )

                                    // Realizar la solicitud POST para crear el nuevo usuario
                                    val resultadoPost = ClientPostMateriaPrima.createMateriaPrima(nuevaMateriaPrima)

                                    // Imprimir la respuesta en la consola
                                    //println("Respuesta de la solicitud POST: $resultadoPost")

                                    // También puedes realizar cualquier otro procesamiento necesario con el resultadoPost
                                } catch (e: Exception) {
                                    // Manejar cualquier excepción que pueda ocurrir durante la solicitud POST
                                    e.printStackTrace()
                                    println("Error al realizar la solicitud POST: ${e.message}")
                                }
                            }
                        }
                    }

                    override fun onNothingSelected(parentView: AdapterView<*>?) {
                            // Manejar el caso en que no se ha seleccionado nada
                    }
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
        //editTextNombreUsuario.text.clear()
        // editTextRutUsuario.text.clear()
        // Limpia más entradas según sea necesario para otras propiedades
    }
}