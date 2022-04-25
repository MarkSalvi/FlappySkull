package com.example.flappyskull

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val  Impostazioni = Impostazioni()
        val btnImpostazioni = findViewById<Button>(R.id.btnImpostazioni)
        val play = findViewById<Button>(R.id.play)

        play.setOnClickListener(){
            Intent(this, GameActivity::class.java).also{
                startActivity(it)
            }
        }

        btnImpostazioni.setOnClickListener{
            //the following code is used to set the fragment to the container
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flImpostazioni,Impostazioni)
                addToBackStack(null)
                commit()
            }
        }

        val chiudi = findViewById<Button>(R.id.exit)

        chiudi.setOnClickListener{
            val intent = Intent(Intent.ACTION_MAIN)
            intent.addCategory(Intent.CATEGORY_HOME)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
            startActivity(intent)
        }

    }
}