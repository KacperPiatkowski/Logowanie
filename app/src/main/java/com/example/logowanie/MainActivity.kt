package com.example.logowanie

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tablica =intent.getStringArrayExtra("Logowanie")
        var zalogowano = false
        var tab = arrayOf("", "")
        if (tablica != null){
            zalogowano = true
            tab = tablica
        }

        findViewById<Button>(R.id.LogIn).setOnClickListener {
            val email = findViewById<EditText>(R.id.Email).text.toString()
            val password = findViewById<EditText>(R.id.Password).text.toString()

            if (email.isEmpty() || password.isEmpty())
                Toast.makeText(this, "Fill in all fields", Toast.LENGTH_SHORT).show()
            else if (email != "k.piatkowski07@gmail.com" || password != "kacper11")
                Toast.makeText(this, "Login error, incorrect email or password.", Toast.LENGTH_SHORT).show()
            else {
                zalogowano = true
                tab[0] = email
                tab[1] = password

                Toast.makeText(this, "", Toast.LENGTH_SHORT).show()

                startActivity(Intent(this, CalulatorActivity::class.java).putExtra("Logowanie", tab))

            }
        }
    }
}