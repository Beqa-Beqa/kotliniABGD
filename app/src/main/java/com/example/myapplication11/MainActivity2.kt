package com.example.myapplication11

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var setCount = 0

        val counter = findViewById<TextView>(R.id.numberCounter)
        counter.text = setCount.toString()

        val clickButton = findViewById<Button>(R.id.increase_counter)
        clickButton.setOnClickListener {
            setCount++
            counter.text = setCount.toString()
        }
    }
}