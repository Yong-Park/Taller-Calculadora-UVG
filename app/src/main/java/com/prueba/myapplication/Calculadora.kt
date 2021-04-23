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
    lateinit var  btnLimpiar: Button

    //trabajo para la funcionalidad de la calculadora


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculadora)
        var punto = true
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
        btnLimpiar = findViewById(R.id.btnLimpiar)

        btnUno.setOnClickListener{
            var data = 1
            txtResultado.text = "${txtResultado.text}$data"
        }
        btnDos.setOnClickListener{
            var data = 2
            txtResultado.text = "${txtResultado.text}$data"
        }
        btnTres.setOnClickListener{
            var data = 3
            txtResultado.text = "${txtResultado.text}$data"
        }
        btnCuatro.setOnClickListener{
            var data = 4
            txtResultado.text = "${txtResultado.text}$data"
        }
        btnCinco.setOnClickListener{
            var data = 5
            txtResultado.text = "${txtResultado.text}$data"
        }
        btnSeis.setOnClickListener{
            var data = 6
            txtResultado.text = "${txtResultado.text}$data"
        }
        btnSiete.setOnClickListener{
            var data = 7
            txtResultado.text = "${txtResultado.text}$data"
        }
        btnOcho.setOnClickListener{
            var data = 8
            txtResultado.text = "${txtResultado.text}$data"
        }
        btnNueve.setOnClickListener{
            var data = 9
            txtResultado.text = "${txtResultado.text}$data"
        }
        btnPunto.setOnClickListener{
            var data = "."
            if(punto){
                if(txtResultado.text.isEmpty()){
                    txtResultado.text = "0."
                }else {
                    txtResultado.text = "${txtResultado.text}$data"
                }
                punto=false
            }

        }
        btnCero.setOnClickListener{
            var data = 0
            txtResultado.text = "${txtResultado.text}$data"
        }
        btnLimpiar.setOnClickListener{
            txtResultado.text = ""
            punto=true
        }
        //realizar las operaciones


    }

}