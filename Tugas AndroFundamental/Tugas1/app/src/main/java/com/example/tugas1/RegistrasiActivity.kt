package com.example.tugas1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class RegistrasiActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registrasi)

        val btnRegist: Button = findViewById(R.id.btn_regis)
        btnRegist.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btn_regis -> {
                val intent = Intent(this@RegistrasiActivity, LoginActivity::class.java)
                startActivity(intent)
            }
        }
    }
}