package com.example.day3myapplicatiion

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        var a = findViewById<TextView>(R.id.textView1)
        var b = findViewById<TextView>(R.id.textView2)
        var btn = findViewById<Button>(R.id.button)
        btn.setOnClickListener{
            Toast.makeText(this, "You have Entered", Toast.LENGTH_SHORT).show()
        }
    }
}
