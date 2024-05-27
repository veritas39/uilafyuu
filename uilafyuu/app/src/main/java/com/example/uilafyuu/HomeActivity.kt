package com.example.uilafyuu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
    }

    fun favprod(view: View) {
        Intent(this, FavoriteActivity::class.java).also {
            startActivity(it)
            finish()
        }
    }

    fun superflashsale(view: View) {
        Intent(this, SuperFlashSaleActivity::class.java).also {
            startActivity(it)
            finish()
        }
    }


    fun logPressed(view: View) {
        Intent(this, HomeActivity::class.java).also {
            Log.d("Test Tap", "Button clicked!")
        }
    }


}