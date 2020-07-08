package com.example.lesson6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var tvMain: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvMain = findViewById<TextView>(R.id.tvMain)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when(item.itemId){
            R.id.products -> startActivity(Intent(applicationContext, ProductsActivity::class.java))
            R.id.services -> startActivity(Intent(applicationContext, ServicesActivity::class.java))
            R.id.aboutApp -> tvMain?.text = "Приложение создано с целью продажи товаров и предоставлении услуг."
        }
        return super.onOptionsItemSelected(item)
    }
}