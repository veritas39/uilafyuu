package com.example.uilafyuu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
    }

    fun backtoHome(view: View) {
        Intent(this, HomeActivity::class.java).also {
            startActivity(it)
            finish()
        }
    }

    fun addFav(view: View) {
        Toast.makeText(this, "Added to favorite", Toast.LENGTH_SHORT).show()
    }

    fun addToCart(view: View) {
        Toast.makeText(this, "Added to Cart", Toast.LENGTH_SHORT).show()
    }
}