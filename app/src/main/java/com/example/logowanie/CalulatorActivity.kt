package com.example.logowanie

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import java.util.Stack

class CalulatorActivity : AppCompatActivity() {


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)
        val planets =  Stack<Int>()

        val tablica = intent.getStringArrayExtra("Logowanie")
        var zalogowano = false
        var tab = arrayOf("", "")
        if (tablica != null) {
            zalogowano = true
            tab = tablica


            findViewById<Button>(R.id.zero).setOnClickListener {
                val empty : Boolean = planets.isEmpty()
                findViewById<TextView>(R.id.wyswietlanie).text ="0 " +empty.toString()
            }
        }
    }
}

