package com.makulky.socialcooking

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun aceptarBoton(view: View){
        val usuarioText = findViewById<EditText>(R.id.editTextText)
        if(usuarioText.text.toString().isNotEmpty()){
            val intent = Intent(this,CreditActivity::class.java)
            startActivity(intent)
        }
        else{
            Toast.makeText(this,"Introduce el nombre del usuario.",Toast.LENGTH_SHORT).show()
        }
    }

}