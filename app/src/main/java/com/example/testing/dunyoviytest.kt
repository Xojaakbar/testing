package com.example.testing

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.testing.databinding.ActivityDunyoviytestBinding
import com.example.testing.databinding.ActivityMainBinding

class dunyoviytest : AppCompatActivity() {
    lateinit var bind : ActivityDunyoviytestBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityDunyoviytestBinding.inflate(layoutInflater)
        setContentView(bind.root)


    }
}