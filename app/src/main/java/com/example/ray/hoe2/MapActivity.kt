package com.camboray.hoe

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class MapActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_map)
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
                .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    override fun onMapReady(googleMap: GoogleMap) {

        mMap = googleMap

        mMap.setMinZoomPreference(15.0f)
        mMap.setMaxZoomPreference(18.0f)

        // Add a marker in Home of English and move the camera
        val hoe = LatLng(11.548259, 104.914899)
        mMap.addMarker(MarkerOptions().position(hoe).title("Home of English"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(hoe))
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

    public fun showCalendar(){
        val intent = Intent(this,CalActivity :: class.java)
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




