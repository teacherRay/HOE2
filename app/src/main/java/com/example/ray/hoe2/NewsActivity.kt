package com.example.ray.hoe2

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button

class NewsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news)
        }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_news,menu)
        super.onCreateOptionsMenu(menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.about_menu_item) {
            showAbout()
        } else if (item.itemId == R.id.map_menu_item) {
            showMap()
        } else if (item.itemId == R.id.calendar_menu_item) {
            showCalendar()
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

    public fun showCalendar(){
        val intent = Intent(this,CalActivity :: class.java)
        startActivity(intent)
    }

    public fun showFees(){
        val intent = Intent(this,FeesActivity :: class.java)
        startActivity(intent)
    }
}


