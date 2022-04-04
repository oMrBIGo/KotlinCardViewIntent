package com.nathit.kotlincardviewintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {

    var cardView1: CardView? = null
    var cardView2: CardView? = null
    var cardView3: CardView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        cardView1 = findViewById<CardView>(R.id.CardView1)
        cardView2 = findViewById<CardView>(R.id.CardView2)
        cardView3 = findViewById<CardView>(R.id.CardView3)

        cardView1!!.setOnClickListener {
            val intent = Intent(this,DetailActivity::class.java)
            startActivity(intent)
        }
        cardView2!!.setOnClickListener {
            val intent = Intent(this,DetailActivity::class.java)
            startActivity(intent)
        }
        cardView3!!.setOnClickListener {
            val intent = Intent(this,DetailActivity::class.java)
            startActivity(intent)
        }

    }
}