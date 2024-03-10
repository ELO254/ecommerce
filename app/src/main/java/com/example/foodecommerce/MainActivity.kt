package com.example.foodecommerce

import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var  recycleView:RecyclerView
    private lateinit var adapter:productAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recycleView = findViewById(R.id.recyclerViewProducts)
        adapter = productAdapter(getProducts())
        recycleView.layoutManager = GridLayoutManager(this,2)
        recycleView.adapter = adapter

    }

    private fun getProducts(): List<product> {
       return listOf(
           product("pizza","1000", R.drawable.pizza),
           product("Burger","200",R.drawable.burger),
           product("pasta", "300", R.drawable.pasta)
       )
    }
}