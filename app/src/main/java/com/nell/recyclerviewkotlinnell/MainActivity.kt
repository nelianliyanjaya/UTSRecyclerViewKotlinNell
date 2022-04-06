package com.nell.recyclerviewkotlinnell

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object {
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val superheroList = listOf<Superhero>(
            Superhero(
                R.drawable.antman,
                nameSuperhero = "Ant-Man",
                descSuperhero = "Neli Comel Neli Comel Neli Comel Neli Comel Neli Comel Neli Comel Neli Comel Neli Comel Neli Comel"
            ),
            Superhero(
                R.drawable.black,
                nameSuperhero = "Black",
                descSuperhero = "Neli Comel Neli Comel Neli Comel Neli Comel Neli Comel Neli Comel Neli Comel Neli Comel Neli Comel"
            ),
            Superhero(
                R.drawable.captain,
                nameSuperhero = "Captain Amerika",
                descSuperhero = "Neli Comel Neli Comel Neli Comel Neli Comel Neli Comel Neli Comel Neli Comel Neli Comel Neli Comel"
            ),
            Superhero(
                R.drawable.doctor,
                nameSuperhero = "Doctor",
                descSuperhero = "Neli Comel Neli Comel Neli Comel Neli Comel Neli Comel Neli Comel Neli Comel Neli Comel Neli Comel"
            ),
            Superhero(
                R.drawable.gamora,
                nameSuperhero = "Gamora",
                descSuperhero = "Neli Comel Neli Comel Neli Comel Neli Comel Neli Comel Neli Comel Neli Comel Neli Comel Neli Comel"
            ),
            Superhero(
                R.drawable.hulk,
                nameSuperhero = "Hulk",
                descSuperhero = "Neli Comel Neli Comel Neli Comel Neli Comel Neli Comel Neli Comel Neli Comel Neli Comel Neli Comel"
            ),
            Superhero(
                R.drawable.iron,
                nameSuperhero = "Iron Man",
                descSuperhero = "Neli Comel Neli Comel Neli Comel Neli Comel Neli Comel Neli Comel Neli Comel Neli Comel Neli Comel"
            ),
            Superhero(
                R.drawable.loki,
                nameSuperhero = "Loki",
                descSuperhero = "Neli Comel Neli Comel Neli Comel Neli Comel Neli Comel Neli Comel Neli Comel Neli Comel Neli Comel"
            ),
            Superhero(
                R.drawable.marvel,
                nameSuperhero = "Marvel",
                descSuperhero = "Neli Comel Neli Comel Neli Comel Neli Comel Neli Comel Neli Comel Neli Comel Neli Comel Neli Comel"
            ),
            Superhero(
                R.drawable.nebula,
                nameSuperhero = "Nebula",
                descSuperhero = "Neli Comel Neli Comel Neli Comel Neli Comel Neli Comel Neli Comel Neli Comel Neli Comel Neli Comel"
            ),
            Superhero(
                R.drawable.panter,
                nameSuperhero = "Panter",
                descSuperhero = "Neli Comel Neli Comel Neli Comel Neli Comel Neli Comel Neli Comel Neli Comel Neli Comel Neli Comel"
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_hero)
        recyclerView.layoutManager = LinearLayoutManager (this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = SuperheroAdapter (this,superheroList){
            val intent = Intent (this, DetailSuperheroActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)

        }

    }
}