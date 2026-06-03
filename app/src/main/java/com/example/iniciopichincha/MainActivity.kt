package com.example.iniciopichincha

import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Referencias a los componentes interactivos
        val cardUserPassword = findViewById<LinearLayout>(R.id.cardUserPassword)
        val cardBiometrics = findViewById<LinearLayout>(R.id.cardBiometrics)
        val cardPin = findViewById<LinearLayout>(R.id.cardPin)
        
        val optionLocate = findViewById<LinearLayout>(R.id.optionLocate)
        val optionKey = findViewById<LinearLayout>(R.id.optionKey)
        val optionCall = findViewById<LinearLayout>(R.id.optionCall)
        
        val linkOtherUser = findViewById<TextView>(R.id.linkOtherUser)

        // Asignación de Click Listeners
        cardUserPassword.setOnClickListener {
            showToast("Abriendo inicio de sesión con Usuario y Contraseña")
        }

        cardBiometrics.setOnClickListener {
            showToast("Activando lector de Huella / Face ID")
        }

        cardPin.setOnClickListener {
            showToast("Abriendo inicio de sesión con Pin de 6 dígitos")
        }

        optionLocate.setOnClickListener {
            showToast("Buscando agencias y cajeros cercanos...")
        }

        optionKey.setOnClickListener {
            showToast("Generando Clave Digital...")
        }

        optionCall.setOnClickListener {
            showToast("Llamando a atención al cliente...")
        }

        linkOtherUser.setOnClickListener {
            showToast("Cargando formulario para ingresar con otro usuario")
        }
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}