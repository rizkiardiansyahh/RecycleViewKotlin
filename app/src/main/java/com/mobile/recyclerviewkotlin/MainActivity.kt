package com.mobile.recyclerviewkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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
                "antman",
                "Lorem Ipsum Lorem Ipsum Lorem Ipsum"
            ),
            Superhero(
                R.drawable.black,
                "Black Widow",
                "Lorem Ipsum Lorem Ipsum Lorem Ipsum"
            ),
            Superhero(
                R.drawable.captain,
                "Captain America",
                "Lorem Ipsum Lorem Ipsum Lorem Ipsum"
            ),
            Superhero(
                R.drawable.doctor,
                "Doctor Strange",
                "Lorem Ipsum Lorem Ipsum Lorem Ipsum"
            ),
            Superhero(
                R.drawable.gamora,
                "gamora",
                "Lorem Ipsum Lorem Ipsum Lorem Ipsum"
            ),
            Superhero(
                R.drawable.hulk,
                "Hulk",
                "Lorem Ipsum Lorem Ipsum Lorem Ipsum"
            ),
            Superhero(
                R.drawable.iron,
                "IronMan",
                "Lorem Ipsum Lorem Ipsum Lorem Ipsum"
            ),
            Superhero(
                R.drawable.loki,
                "Loki",
                "Lorem Ipsum Lorem Ipsum Lorem Ipsum"
            ),
            Superhero(
                R.drawable.marvel,
                "Captain Marvel",
                "Lorem Ipsum Lorem Ipsum Lorem Ipsum"
            ),
            Superhero(
                R.drawable.nebula,
                "Nebula",
                "Lorem Ipsum Lorem Ipsum Lorem Ipsum"
            ),

            Superhero(
                R.drawable.panter,
                "Black Phanter",
                "Lorem Ipsum Lorem Ipsum Lorem Ipsum"
            )
            )


        val recyclerView = findViewById<RecyclerView>(R.id.rv_hero)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = SuperheroAdapter(this, superheroList){

            val intent = Intent (this, DetailSuperheroActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }

    }
}