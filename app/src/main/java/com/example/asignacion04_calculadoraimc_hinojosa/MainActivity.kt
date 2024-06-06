package com.example.asignacion04_calculadoraimc_hinojosa

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etPeso = findViewById<EditText>(R.id.etPeso)
        val etEstatura = findViewById<EditText>(R.id.etEstatura)
        val btnCalcular = findViewById<Button>(R.id.btnCalcular)
        val txtResultado = findViewById<TextView>(R.id.txtIMCResultado)

        btnCalcular.setOnClickListener {
            val peso = etPeso.text.toString().toFloatOrNull()
            val estatura = etEstatura.text.toString().toFloatOrNull()

            if (peso != null && estatura != null && estatura > 0) {
                val imc = peso / (estatura * estatura)
                txtResultado.text = "Tu IMC es: %.2f".format(imc)
            } else {
                txtResultado.text = "Por favor ingrese valores válidos"
            }
        }
    }
}
