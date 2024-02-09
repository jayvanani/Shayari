package com.example.shayari

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var start:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        start=findViewById(R.id.start)

        start.setOnClickListener {

            intent= Intent(this@MainActivity,MainActivity2::class.java)

            startActivity(intent)
        }


    }
}