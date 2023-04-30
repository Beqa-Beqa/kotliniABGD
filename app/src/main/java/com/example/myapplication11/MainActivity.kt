package com.example.myapplication11

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.myapplication11.R.id.name_editText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonOkay = findViewById<Button>(R.id.okay_button)
        buttonOkay.setOnClickListener {
            val name = findViewById<EditText>(R.id.name_editText)
            val profileText = findViewById<TextView>(R.id.greetings)
            profileText.text = "Hello, $name"
        }

        val buttonNext = findViewById<Button>(R.id.next_button)
        buttonNext.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
    }
}