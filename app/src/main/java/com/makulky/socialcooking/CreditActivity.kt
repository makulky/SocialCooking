package com.makulky.socialcooking

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class CreditActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_credit)
    }

    fun contactarOnClick(view: View){
        val direccionCorreo = "mfigalo996@g.educaand.es"
        val asunto = "Consulta de la app ${getString(R.string.app_name)}"

        val enviarEmail = Intent(Intent.ACTION_SENDTO).apply {
            data = Uri.parse("mailto:")
            putExtra(Intent.EXTRA_EMAIL, arrayOf(direccionCorreo))
            putExtra(Intent.EXTRA_SUBJECT, asunto)
        }
        startActivity(enviarEmail)
    }

}