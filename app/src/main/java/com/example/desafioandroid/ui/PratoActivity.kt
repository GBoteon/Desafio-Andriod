package com.example.desafioandroid.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.desafioandroid.R
import kotlinx.android.synthetic.main.activity_prato.*

class PratoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_prato)
        voltar_detalhe.setOnClickListener {
            startActivity(Intent(this, DescricaoActivity::class.java))
        }
        text_view3.text = intent.extras!!.getString("descricao")

    }
}