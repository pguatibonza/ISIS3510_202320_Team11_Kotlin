package com.ubs.truckdriverapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonClick = findViewById<Button>(R.id.botonMapa)
        buttonClick.setOnClickListener {
            val intent = Intent(this, FuncAF::class.java)
            startActivity(intent)
        }
    }
}