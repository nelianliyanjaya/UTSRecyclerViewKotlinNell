package com.nell.recyclerviewkotlinnell

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailPakaianActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_pakaian)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val pakaian = intent.getParcelableExtra<Pakaian>(MainActivity.INTENT_PARCELABLE)

        val imgPakaian = findViewById<ImageView>(R.id.img_item_photo)
        val namePakaian = findViewById<TextView>(R.id.tv_item_name)
        val descPakaian = findViewById<TextView>(R.id.tv_item_description)

        imgPakaian.setImageResource(pakaian?.imgPakaian!!)
        namePakaian.text = pakaian.namePakaian
        descPakaian.text = pakaian.descPakaian

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}