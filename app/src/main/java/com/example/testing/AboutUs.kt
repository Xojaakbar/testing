package com.example.testing

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.testing.databinding.ActivityAboutUsBinding

class AboutUs : AppCompatActivity(),View.OnClickListener {
    lateinit var bind : ActivityAboutUsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityAboutUsBinding.inflate(layoutInflater)
        setContentView(bind.root)
        bind.apply {
            back.setOnClickListener(this@AboutUs)
            shiqish.setOnClickListener(this@AboutUs)
            imageView2.setOnClickListener(this@AboutUs)
        }

    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.back ->{finishAffinity() }
            R.id.shiqish->{startActivity(Intent(this,MainActivity::class.java))}
            R.id.imageView2 ->{toast()}
        }
    }
    private fun toast(){
        Toast.makeText(this, "Back bosildi", Toast.LENGTH_LONG).show()
    }
}