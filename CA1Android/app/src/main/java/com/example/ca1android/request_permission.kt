package com.example.ca1android

import android.annotation.SuppressLint
import android.content.pm.PackageManager
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class request_permission : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_request_permission)
        var b1 = findViewById<Button>(R.id.button7)
        b1.setOnClickListener {
            if(ContextCompat.checkSelfPermission(this,android.Manifest.permission.CAMERA)==PackageManager.PERMISSION_DENIED)
                ActivityCompat.requestPermissions(this, arrayOf(android.Manifest.permission.CAMERA),1)
            else{
                Toast.makeText(this, "already granted", Toast.LENGTH_LONG).show()
            }
        }
    }
}