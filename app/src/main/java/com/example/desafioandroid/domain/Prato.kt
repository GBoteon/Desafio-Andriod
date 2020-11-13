package com.example.desafioandroid.domain

class Prato (val img: Int, var nome:String, val descricao:String) {
    override fun toString(): String {
        return "nome: $nome | descricao: $descricao"
    }
}