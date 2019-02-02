package com.sekreative.kotlinkickstart

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnShow = findViewById<Button>(R.id.button)
        val textView: TextView = findViewById(R.id.textView) as TextView

        btnShow?.setOnClickListener {
            textView.text = "Yaay! Kotlin is so Easy!"
        }
    }

}


