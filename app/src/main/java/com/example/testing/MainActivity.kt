package com.example.testing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.testing.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var bind : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bind.root)

        bind.dunyoviytestlar.setOnClickListener {
            val intent_dunyoviy = Intent(this,dunyoviytest::class.java)
            startActivity(intent_dunyoviy)
        }
        bind.exit.setOnClickListener {
            finishAffinity()
        }
        bind.about.setOnClickListener {
            var intent_about_us = Intent(this, AboutUs::class.java)
            startActivity(intent_about_us)
        }
    }
}