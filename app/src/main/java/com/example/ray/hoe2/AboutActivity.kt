package com.example.ray.hoe2

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AboutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        val btnNewsScreen : Button = findViewById(R.id.buttonNews)
        btnNewsScreen.setOnClickListener{
            val intent = Intent(this,NewsActivity :: class.java)
            startActivity(intent)
        }

        val btnFeesScreen : Button = findViewById(R.id.buttonFees)
        btnFeesScreen.setOnClickListener{
            val intent = Intent(this,FeesActivity :: class.java)
            startActivity(intent)
        }
        val btnMapScreen : Button = findViewById(R.id.buttonMap)
        btnMapScreen.setOnClickListener{
            val intent = Intent(this,MapActivity :: class.java)
            startActivity(intent)
        }

        val btnCalendarScreen : Button = findViewById(R.id.buttonCalendar)
        btnCalendarScreen.setOnClickListener{
            val intent = Intent(this,CalendarActivity :: class.java)
            startActivity(intent)
        }
    }


}
