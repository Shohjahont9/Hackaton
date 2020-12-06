package com.example.hackaton.reg

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.hackaton.R

class RegistratsiyaActivity : AppCompatActivity() {
    private lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registratsiya)
        button = findViewById(R.id.send_btn)
        button.setOnClickListener {
            startActivity(Intent(applicationContext, Confirm4Activity::class.java))
        }
    }
}