package com.example.ca1android

import android.os.Bundle
import android.widget.Button
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

        val a = findViewById<Button>(R.id.btn1)

        a.setOnClickListener {
            Toast.makeText(this, "Welcome back", Toast.LENGTH_SHORT).show()
        }
    }
}