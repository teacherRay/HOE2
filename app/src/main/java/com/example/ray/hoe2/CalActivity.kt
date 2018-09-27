package com.camboray.hoe

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageView
import com.squareup.picasso.Picasso

class CalActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cal)

        //var CalImage = findViewById(R.id.calImage) as ImageView
        //Picasso.get().load("http://www.homeofenglish.edu.kh/images/Gallery/App/calendar_2018s.png").into(CalImage)
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_calendar,menu)
        super.onCreateOptionsMenu(menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.about_menu_item) {
            showAbout()
        } else if (item.itemId == R.id.map_menu_item) {
            showMap()
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

    public fun showNews(){
        val intent = Intent(this,NewsActivity :: class.java)
        startActivity(intent)
    }
    public fun showFees(){
        val intent = Intent(this,FeesActivity :: class.java)
        startActivity(intent)
    }
}
