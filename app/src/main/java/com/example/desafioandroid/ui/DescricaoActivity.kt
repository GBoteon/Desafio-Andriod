package com.example.desafioandroid.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.example.desafioandroid.R
import com.example.desafioandroid.domain.Prato
import kotlinx.android.synthetic.main.activity_descricao.*

class DescricaoActivity : AppCompatActivity(), ListaPratosAdapter.OnItemClickListenerPrato {
    private val listapratos = getListaPratos()
    private val adapter = ListaPratosAdapter(listapratos, this)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_descricao)
        voltar_main.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
        recycler_view_pratos.adapter = adapter
        recycler_view_pratos.layoutManager = GridLayoutManager(this, 2)
        recycler_view_pratos.setHasFixedSize(true)
    }
    fun getListaPratos(): ArrayList<Prato> {
        var prato = Prato(R.drawable.image4, "Salada com molho Gengibre", "Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis")
        var lista_pratos = arrayListOf(prato, prato, prato, prato, prato, prato, prato, prato, prato, prato, prato, prato)
        return lista_pratos
    }

    override fun onItemClick(position: Int) {
        if(position == 0) {
            val i = Intent(this, PratoActivity::class.java)
            i.putExtra("descricao", listapratos[position].descricao)
            startActivity(i)
        }
    }
}