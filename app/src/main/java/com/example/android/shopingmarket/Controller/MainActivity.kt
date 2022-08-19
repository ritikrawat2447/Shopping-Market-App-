package com.example.android.shopingmarket.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.android.shopingmarket.Adapters.CategoryRecycleAdapter
import com.example.android.shopingmarket.Models.Products
import com.example.android.shopingmarket.R
import com.example.android.shopingmarket.Sevices.DataService
import com.example.android.shopingmarket.Utilties.EXTRA_PRODUCTS


class MainActivity : AppCompatActivity() {

    lateinit var adapter : CategoryRecycleAdapter
    var product = Products("","","")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryRecycleAdapter(this, DataService.categories ) { category ->
            val productIntent = Intent(this,ProductsActivity::class.java)
            product.title = category.title
            productIntent.putExtra(EXTRA_PRODUCTS,product)
            startActivity(productIntent)
        }
        val lv : RecyclerView = findViewById(R.id.categoryListView)
        lv.adapter = adapter

        val layoutManager = LinearLayoutManager(this)
        lv.layoutManager = layoutManager
        lv.setHasFixedSize(true)


//        lv.setOnClickListener { adapterView, view, i, id ->
//            val category = DataService.categories[i]
//            Toast.makeText(this, "You clicked on the ${category.title} cell" , Toast.LENGTH_SHORT ).show()
//        } // This msg shown when click on a category

    }
}

