package com.example.android.shopingmarket.Controller

import android.content.Intent
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.android.shopingmarket.Adapters.ProductsAdapter
import com.example.android.shopingmarket.Models.Products
import com.example.android.shopingmarket.R
import com.example.android.shopingmarket.Sevices.DataService
import com.example.android.shopingmarket.Utilties.EXTRA_PRODUCTS

class ProductsActivity : AppCompatActivity() {

    lateinit var adapter : ProductsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val categoryType = intent.getParcelableExtra<Products>(EXTRA_PRODUCTS)!!
        adapter = ProductsAdapter(this , DataService.getProducts(categoryType.title)) { Products ->
            val productIntent = Intent(this,ProductDescription::class.java)
            productIntent.putExtra(EXTRA_PRODUCTS,Products)
            startActivity(productIntent)

        }

        var spanCount = 2
        val orientation = resources.configuration.orientation
        if ( orientation == Configuration.ORIENTATION_LANDSCAPE ){
            spanCount = 3
        }

        val screenSize = resources.configuration.screenWidthDp
        if ( screenSize > 720 ){
            spanCount = 3
        }

        val layoutManager = GridLayoutManager(this , spanCount)
        val productsListView : RecyclerView = findViewById(R.id.productListView)
        productsListView.layoutManager = layoutManager
        productsListView.adapter = adapter

    }
}