package com.example.tugas1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class RegistrasiActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var etUsername: EditText
    private lateinit var etPassword : EditText
    private lateinit var etConfirmPass : EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registrasi)

        etUsername = findViewById(R.id.edt_username)
        etPassword = findViewById(R.id.edt_password)
        etConfirmPass = findViewById(R.id.edt_fullname)

        val btnRegist: Button = findViewById(R.id.btn_regis)
        btnRegist.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btn_regis -> {

                val bundle = Bundle()
                bundle.putString("username", etUsername.text.toString())
                bundle.putString("password", etPassword.text.toString())

                val intent = Intent(this@RegistrasiActivity, LoginActivity::class.java)
                intent.putExtras(bundle)
                startActivity(intent)
            }
        }
    }
}