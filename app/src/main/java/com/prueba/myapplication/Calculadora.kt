package com.prueba.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class Calculadora : AppCompatActivity() {
    lateinit var txtResultado: TextView
    lateinit var  btnUno: Button
    lateinit var  btnDos: Button
    lateinit var  btnTres: Button
    lateinit var  btnMas: Button
    lateinit var  btnCuatro: Button
    lateinit var  btnCinco: Button
    lateinit var  btnSeis: Button
    lateinit var  btnSiete: Button
    lateinit var  btnOcho: Button
    lateinit var  btnNueve: Button
    lateinit var btnResta:Button
    lateinit var btnMultiplicar:Button
    lateinit var btnDividir:Button
    lateinit var btnPunto:Button
    lateinit var btnCero: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculadora)

        txtResultado = findViewById(R.id.textResultado)

        btnUno = findViewById(R.id.btnUno)
        btnDos = findViewById(R.id.btnDos)
        btnTres = findViewById(R.id.btnTres)
        btnMas = findViewById(R.id.btnMas)
        btnCuatro = findViewById(R.id.btnCuatro)
        btnCinco = findViewById(R.id.btnCinco)
        btnSeis = findViewById(R.id.btnSeis)
        btnSiete = findViewById(R.id.btnSiete)
        btnOcho = findViewById(R.id.btnOcho)
        btnNueve = findViewById(R.id.btnNueve)
        btnMultiplicar = findViewById(R.id.btnMultiplicar)
        btnResta = findViewById(R.id.btnMenos)
        btnDividir = findViewById(R.id.btnDividir)
        btnPunto = findViewById(R.id.btnPunto)
        btnCero = findViewById(R.id.btnCero)

        btnUno.setOnClickListener{
            txtResultado.text = "1"
        }
        btnDos.setOnClickListener{
            txtResultado.text = "2"
        }
        btnTres.setOnClickListener{
            txtResultado.text = "3"
        }
        btnCuatro.setOnClickListener{
            txtResultado.text = "4"
        }
        btnCinco.setOnClickListener{
            txtResultado.text = "5"
        }
        btnSeis.setOnClickListener{
            txtResultado.text = "6"
        }
        btnSiete.setOnClickListener{
            txtResultado.text = "7"
        }
        btnOcho.setOnClickListener{
            txtResultado.text = "8"
        }
        btnNueve.setOnClickListener{
            txtResultado.text = "9"
        }
        btnPunto.setOnClickListener{
            txtResultado.text = "."
        }
        btnCero.setOnClickListener{
            txtResultado.text = "0"
        }

    }
}