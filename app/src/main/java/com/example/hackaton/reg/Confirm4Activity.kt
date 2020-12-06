package com.example.hackaton.reg

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.hackaton.MainActivity
import com.example.hackaton.R

class Confirm4Activity : AppCompatActivity() {
    lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_confirm4)
        button = findViewById(R.id.verify_btn)
        button.setOnClickListener {
            startActivity(Intent(applicationContext, MainActivity::class.java))
        }
    }
}