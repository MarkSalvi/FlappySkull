package com.example.flappyskull

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton


class GameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)


    val  Impostazioni = Impostazioni()
    val btnImpostazioni = findViewById<ImageButton>(R.id.btnImpostazioni)
        val leave = findViewById<ImageButton>(R.id.btnleave)

    btnImpostazioni.setOnClickListener{
        //the following code is used to set the fragment to the container
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flImpostazioni,Impostazioni)
            addToBackStack(null)
            commit()
        }
    }

        leave.setOnClickListener(){
            Intent(this, MainActivity::class.java).also{
                startActivity(it)
                finishAffinity()
            }
        }

    }
}