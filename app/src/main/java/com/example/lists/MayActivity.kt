package com.example.lists

import ApiInterface
import MyRecyclerViewAdapter
import android.app.Activity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

data class Hero(
    val id: Int,
    val name: String,
    val slug: String,
    val powerstats: Powerstats,
    val appearance: Appearance,
    val biography: Biography,
    val work: Work,
    val connections: Connections,
    val images: Images
)

data class Powerstats(
    val intelligence: Int,
    val strength: Int,
    val speed: Int,
    val durability: Int,
    val power: Int,
    val combat: Int
)

data class Appearance(
    val gender: String,
    val race: String,
    val height: List<String>,
    val weight: List<String>,
    val eyeColor: String,
    val hairColor: String
)

data class Biography(
    val fullName: String,
    val alterEgos: String,
    val aliases: List<String>,
    val placeOfBirth: String,
    val firstAppearance: String,
    val publisher: String,
    val alignment: String
)

data class Work(
    val occupation: String,
    val base: String
)

data class Connections(
    val groupAffiliation: String,
    val relatives: String
)

data class Images(
    val sm: String
)

class MayActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_layout)
        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        val api = ApiClient.client.create(ApiInterface::class.java)
        val adapter = MyRecyclerViewAdapter()
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)

        api.getHeroes()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                if (it.isNotEmpty()) {
                    val heroes = it
                    adapter.heroes = heroes.toMutableList()
                    adapter.notifyDataSetChanged()
                }
            }, {
                Toast.makeText(this, "Error -> $it", Toast.LENGTH_SHORT).show()
            })
    }
}
