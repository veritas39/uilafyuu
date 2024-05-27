package com.example.uilafyuu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.Toast

class FavoriteActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_favorite)
    }

    fun backtoHome(view: View) {
        Intent(this, HomeActivity::class.java).also {
            startActivity(it)
            finish()
        }
    }

    fun delfavprod1(view: View) {
        val myView: View = findViewById(R.id.favprod1)
        myView.visibility = View.INVISIBLE
        Toast.makeText(this, "Successful delete a favorited product", Toast.LENGTH_SHORT).show()
    }

    fun delfavprod2(view: View) {
        val myView: View = findViewById(R.id.favprod2)
        myView.visibility = View.INVISIBLE
        Toast.makeText(this, "Successful delete a favorited product", Toast.LENGTH_SHORT).show()
    }

    fun delfavprod3(view: View) {
        val myView: View = findViewById(R.id.favprod3)
        myView.visibility = View.INVISIBLE
        Toast.makeText(this, "Successful delete a favorited product", Toast.LENGTH_SHORT).show()
    }

    fun delfavprod4(view: View) {
        val myView: View = findViewById(R.id.favprod4)
        myView.visibility = View.INVISIBLE
        Toast.makeText(this, "Successful delete a favorited product", Toast.LENGTH_SHORT).show()
    }

    fun restoredel(view: View) {
        val myView1: View = findViewById(R.id.favprod1)
        val myView2: View = findViewById(R.id.favprod2)
        val myView3: View = findViewById(R.id.favprod3)
        val myView4: View = findViewById(R.id.favprod4)
        myView1.visibility = View.INVISIBLE
        myView2.visibility = View.INVISIBLE
        myView3.visibility = View.INVISIBLE
        myView4.visibility = View.INVISIBLE
        Toast.makeText(this, "Successful restore deleted product", Toast.LENGTH_SHORT).show()
    }

}