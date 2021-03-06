package com.example.desafioandroid.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.desafioandroid.R
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        btn_login.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
        btn_register.setOnClickListener {
            startActivity(Intent(this, CadastroActivity::class.java))
        }
    }
}