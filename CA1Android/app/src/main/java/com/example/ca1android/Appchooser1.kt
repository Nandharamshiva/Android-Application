package com.example.ca1android

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Appchooser1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_appchooser1)

        val btn = findViewById<Button>(R.id.button)
        val check1 = findViewById<CheckBox>(R.id.checkBox)
        val check2 = findViewById<CheckBox>(R.id.checkBox2)
        val check3 = findViewById<CheckBox>(R.id.checkBox3)

        btn.setOnClickListener {
            Sharetxt("hello, share this msg")
        }
        check1.setOnClickListener {
            Sharetxt("hello")
        }
        check2.setOnClickListener {
            Sharetxt("hello")
        }
        check3.setOnClickListener {
            Sharetxt("hello")
        }
    }

    fun Sharetxt(message: String) {
        val send: Intent = Intent().apply {
            action = Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, message)
            type = "text/plain"
        }
        val chooser1: Intent = Intent.createChooser(send, "share via")
        startActivity(chooser1)
    }
}
