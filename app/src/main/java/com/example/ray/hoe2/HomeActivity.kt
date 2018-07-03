package com.example.ray.hoe2

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val btnNextScreen : Button = findViewById(R.id.buttonhome)
        btnNextScreen.setOnClickListener{
            val intent = Intent(this,AboutActivity :: class.java)
            startActivity(intent)
        }
    }


}
