package com.example.desafioandroid.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.desafioandroid.R
import com.example.desafioandroid.domain.Restaurante
import kotlinx.android.synthetic.main.activity_main.*
import com.example.desafioandroid.R.drawable.image1 as image1
import com.example.desafioandroid.R.drawable.image4 as image2
import com.example.desafioandroid.R.drawable.image5 as image3
import com.example.desafioandroid.R.drawable.image3 as image4

class MainActivity : AppCompatActivity(), ListaRestaurantesAdapter.OnItemClickListener {
    private val listarestaurantes = getListaRestaurantes()
    private val adapter = ListaRestaurantesAdapter(listarestaurantes, this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recycler_view_restaurantes.adapter = adapter
        recycler_view_restaurantes.layoutManager = LinearLayoutManager(this)
        recycler_view_restaurantes.setHasFixedSize(true)
    }

    fun getListaRestaurantes(): ArrayList<Restaurante> {
        val nomes_restaurantes = listOf("Tony Roma's", "Aoyama - Moema", "Outback - Moema", "Sí Señor")
        val local_restaurantes = listOf("Av. Lavandisca, 717 - Indianópolis, São Paulo", "Alameda dos Arapanés, 532 - Moema", "Av. Moaci, 187, 187 - Moema, São Paulo", "Alameda Jauaperi, 626 - Moema")
        val horario_restaurantes = listOf("Fecha às 22:00", "Fecha às 00:00", "Fecha às 00:00", "Fecha às 01:00")

        var lista_restaurantes = arrayListOf(Restaurante(image1, nomes_restaurantes[0], local_restaurantes[0], horario_restaurantes[0]),
            Restaurante(image2, nomes_restaurantes[1], local_restaurantes[1], horario_restaurantes[1]),
            Restaurante(image3, nomes_restaurantes[2], local_restaurantes[2], horario_restaurantes[2]),
            Restaurante(image4, nomes_restaurantes[3], local_restaurantes[3], horario_restaurantes[3]))
        return lista_restaurantes
    }
    override fun onItemClick(position: Int) {
        if(position == 0) {
            startActivity(Intent(this, DescricaoActivity::class.java))
        }
    }
}