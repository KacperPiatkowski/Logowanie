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
                Toast.makeText(this, "Brakuje emailu lub hasła", Toast.LENGTH_SHORT).show()
            else if (email != "k.piatkowski07@gmail.com" || password != "kacper11")
                Toast.makeText(this, "Niepoprawny email lub hasło, spróbuj ponownie", Toast.LENGTH_SHORT).show()
            else {
                zalogowano = true
                tab[0] = email
                tab[1] = password

                Toast.makeText(this, "Zalogowano", Toast.LENGTH_SHORT).show()

                startActivity(Intent(this, CalculatorActivity::class.java).putExtra("Logowanie", tab))

            }
        }
        findViewById<Button>(R.id.SKIP).setOnClickListener {
            Toast.makeText(this, "Skip", Toast.LENGTH_SHORT).show()
            startActivity(Intent(this, CalculatorActivity::class.java))
        }
    }
}