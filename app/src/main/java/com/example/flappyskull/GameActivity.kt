package com.example.flappyskull

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class GameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        val url = "file:///android_asset/index.html"
        val web = findViewById<WebView>(R.id.wv)
        web.settings.javaScriptEnabled = true
        web.loadUrl(url)

    }


}