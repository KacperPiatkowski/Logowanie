package com.example.logowanie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class IndexActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tab =intent.getStringArrayExtra("Logowanie")
    }
}