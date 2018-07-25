package com.example.ray.hoe2

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import kotlinx.android.synthetic.main.activity_about.*


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
            val intent = Intent(this,CalActivity :: class.java)
            startActivity(intent)
        }


        }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu,menu)
        super.onCreateOptionsMenu(menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.about_menu_item) {
            showAbout()
        } else if (item.itemId == R.id.map_menu_item) {
            showMap()
        } else if (item.itemId == R.id.contact_menu_item) {
            showContact()
        } else if (item.itemId == R.id.news_menu_item) {
            showNews()
        } else if (item.itemId == R.id.fees_menu_item) {
            showFees()
        }
        return true
    }


        private fun showAbout(){
            val intent = Intent(this,AboutActivity :: class.java)
            startActivity(intent)
        }

        public fun showMap(){
            val intent = Intent(this,MapActivity :: class.java)
            startActivity(intent)
        }

        public fun showContact(){
            val intent = Intent(this,FeesActivity :: class.java)
            startActivity(intent)
        }
        public fun showNews(){
            val intent = Intent(this,NewsActivity :: class.java)
            startActivity(intent)
        }
        public fun showFees(){
            val intent = Intent(this,FeesActivity :: class.java)
            startActivity(intent)
        }
    }







