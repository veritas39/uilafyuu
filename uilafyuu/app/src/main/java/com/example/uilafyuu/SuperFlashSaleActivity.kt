package com.example.uilafyuu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class SuperFlashSaleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_superflashsale)
    }

    fun backtoHome(view: View) {
        Intent(this, HomeActivity::class.java).also {
            startActivity(it)
            finish()
        }
    }
}