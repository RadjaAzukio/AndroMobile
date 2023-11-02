package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonMain = findViewById<Button>(R.id.button_main)
        buttonMain.setOnClickListener {
            Intent(this, ActivityDua::class.java).also {
                startActivity(it)
            }
        }
    }
}