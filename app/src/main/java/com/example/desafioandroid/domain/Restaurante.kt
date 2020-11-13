package com.example.desafioandroid.domain

class Restaurante (val img: Int, var nome:String, val local:String, val horario:String) {
    override fun toString(): String {
        return "nome: $nome | local: $local | horario: $horario"
    }
}