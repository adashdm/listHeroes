package com.example.lists

import ApiInterface
import MyRecyclerViewAdapter
import android.app.Activity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import dagger.Provides
import dagger.hilt.android.HiltAndroidApp
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.cancel
import kotlinx.coroutines.launch



class MayActivity : Activity() {
    private val CoroutineScope = CoroutineScope(Dispatchers.Main)

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_layout)
        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        val apiClient = ApiClient()
        val api = apiClient.client.create(ApiInterface::class.java)
        val adapter = MyRecyclerViewAdapter()
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)

        CoroutineScope.launch {
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
                    Toast.makeText(this@MayActivity, "Error -> $it", Toast.LENGTH_SHORT).show()
                })
        }
    }


    override fun onDestroy() {
        super.onDestroy()
        CoroutineScope.cancel()
    }


    override fun onResume() {
        super.onResume()
        CoroutineScope.launch {
            Toast.makeText(this@MayActivity, "Comeback =)", Toast.LENGTH_SHORT).show()
        }
    }
}
