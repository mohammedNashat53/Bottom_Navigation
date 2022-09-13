package com.example.botomnavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val bottomNavigation = findViewById<BottomNavigationView>(R.id.bottomNavigationBar)
        bottomNavigation.setOnItemSelectedListener {
            when(it.itemId){
                R.id.nav_bar_close_app -> finish()
                R.id.nav_bar_first_fragment -> creatAToast("First")
                R.id.nav_bar_second_fragment -> creatAToast("Second")
                R.id.nav_bar_third_fragment -> creatAToast("Third")
            }
            true
        }
    }

    private fun creatAToast(text: String) {
        Toast.makeText(this,text ,Toast.LENGTH_SHORT).show()
    }


}