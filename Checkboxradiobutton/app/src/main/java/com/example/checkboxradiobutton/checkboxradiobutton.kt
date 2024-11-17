package com.example.checkboxradiobutton

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class checkboxradiobutton {
    class MainActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            enableEdgeToEdge()
            setContentView(R.layout.activity_main)
            val a = findViewById<RadioButton>(R.id.radioButton3)
            val b = findViewById<RadioButton>(R.id.radioButton4)
            val c = findViewById<RadioButton>(R.id.radioButton5)
            val d = findViewById<RadioButton>(R.id.radioButton6)
            val e = findViewById<CheckBox>(R.id.checkBox)
            val f = findViewById<RadioButton>(R.id.radioButton7)
            val g = findViewById<RadioButton>(R.id.radioButton8)
            val h = findViewById<RadioButton>(R.id.radioButton9)
            val i = findViewById<TextView>(R.id.textView2)
            val j = findViewById<TextView>(R.id.textView3)
            val k = findViewById<Button>(R.id.button)
            val l = findViewById<RadioGroup>(R.id.radioGroup1)
            val m = findViewById<RadioGroup>(R.id.radioGroup2)


            a.setOnCheckedChangeListener{buttonView, isChecked ->
                Toast.makeText(this,isChecked.toString(), Toast.LENGTH_SHORT).show()
            }
            b.setOnCheckedChangeListener{buttonView, isChecked ->
                Toast.makeText(this,isChecked.toString(), Toast.LENGTH_SHORT).show()
            }
            c.setOnCheckedChangeListener{buttonView, isChecked ->
                Toast.makeText(this,isChecked.toString(), Toast.LENGTH_SHORT).show()
            }
            d.setOnCheckedChangeListener{buttonView, isChecked ->
                Toast.makeText(this,isChecked.toString(), Toast.LENGTH_SHORT).show()
            }
            e.setOnCheckedChangeListener{buttonView, isChecked ->
                Toast.makeText(this,isChecked.toString(), Toast.LENGTH_SHORT).show()
            }
            f.setOnCheckedChangeListener{buttonView, isChecked ->
                Toast.makeText(this,isChecked.toString(), Toast.LENGTH_SHORT).show()
            }
            g.setOnCheckedChangeListener{buttonView, isChecked ->
                Toast.makeText(this,isChecked.toString(), Toast.LENGTH_SHORT).show()
            }
            h.setOnCheckedChangeListener{buttonView, isChecked ->
                Toast.makeText(this,isChecked.toString(), Toast.LENGTH_SHORT).show()
            }
            l.setOnCheckedChangeListener{buttonView, isChecked ->
                Toast.makeText(this,isChecked.toString(), Toast.LENGTH_SHORT).show()
            }
            m.setOnCheckedChangeListener{buttonView, isChecked ->
                Toast.makeText(this,isChecked.toString(), Toast.LENGTH_SHORT).show()
            }

        }
    }
}