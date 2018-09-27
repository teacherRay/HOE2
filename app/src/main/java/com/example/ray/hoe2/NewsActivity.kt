package com.camboray.hoe

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageView

import com.squareup.picasso.Picasso

class NewsActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news)

        var Image1 = findViewById(R.id.image1) as ImageView
        var Image2 = findViewById(R.id.image2) as ImageView
        var Image3 = findViewById(R.id.image3) as ImageView
        var Image4 = findViewById(R.id.image4) as ImageView
        var Image5 = findViewById(R.id.image5) as ImageView
        var Image6 = findViewById(R.id.image6) as ImageView
        var Image7 = findViewById(R.id.image7) as ImageView
        var Image8 = findViewById(R.id.image8) as ImageView
        var Image9 = findViewById(R.id.image9) as ImageView
        var Image10 = findViewById(R.id.image10) as ImageView
        var Image11 = findViewById(R.id.image11) as ImageView
        var Image12 = findViewById(R.id.image12) as ImageView



        Picasso.get().load("http://www.homeofenglish.edu.kh/images/Gallery/App/image1.jpg").into(Image1)
        Picasso.get().load("http://www.homeofenglish.edu.kh/images/Gallery/App/image2.jpg").into(Image2)
        Picasso.get().load("http://www.homeofenglish.edu.kh/images/Gallery/App/image3.jpg").into(Image3)
        Picasso.get().load("http://www.homeofenglish.edu.kh/images/Gallery/App/image4.jpg").into(Image4)
        Picasso.get().load("http://www.homeofenglish.edu.kh/images/Gallery/App/image5.jpg").into(Image5)
        Picasso.get().load("http://www.homeofenglish.edu.kh/images/Gallery/App/image6.jpg").into(Image6)
        Picasso.get().load("http://www.homeofenglish.edu.kh/images/Gallery/App/image7.jpg").into(Image7)
        Picasso.get().load("http://www.homeofenglish.edu.kh/images/Gallery/App/image8.jpg").into(Image8)
        Picasso.get().load("http://www.homeofenglish.edu.kh/images/Gallery/App/image9.jpg").into(Image9)
        Picasso.get().load("http://www.homeofenglish.edu.kh/images/Gallery/App/image10.jpg").into(Image10)
        Picasso.get().load("http://www.homeofenglish.edu.kh/images/Gallery/App/image11.jpg").into(Image11)
        Picasso.get().load("http://www.homeofenglish.edu.kh/images/Gallery/App/image12.jpg").into(Image12)
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_map,menu)
        super.onCreateOptionsMenu(menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.about_menu_item) {
            showAbout()
        } else if (item.itemId == R.id.calendar_menu_item) {
            showCalendar()
        } else if (item.itemId == R.id.about_menu_item) {
            showAbout()
        } else if (item.itemId == R.id.fees_menu_item) {
            showFees()
        } else if (item.itemId == R.id.map_menu_item) {
            showMap()
        }
        return true
    }


    private fun showAbout(){
        val intent = Intent(this,AboutActivity :: class.java)
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

    public fun showMap(){
        val intent = Intent(this,MapActivity :: class.java)
        startActivity(intent)
    }
}