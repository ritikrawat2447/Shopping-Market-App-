package com.example.android.shopingmarket.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.android.shopingmarket.Adapters.ProductDescriptionAdapter
import com.example.android.shopingmarket.Adapters.ProductsAdapter
import com.example.android.shopingmarket.Models.Products
import com.example.android.shopingmarket.R
import com.example.android.shopingmarket.Sevices.DataService
import com.example.android.shopingmarket.Utilties.EXTRA_PRODUCTS

class ProductDescription : AppCompatActivity() {

   lateinit var adapter : ProductDescriptionAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_description)

        val categoryType = intent.getParcelableExtra<Products>(EXTRA_PRODUCTS)!!
//        adapter = ProductDescriptionAdapter(this,DataService.getProducts(categoryType.title))
        val name : TextView = findViewById(R.id.productName2)
        val price : TextView = findViewById(R.id.productPrice2)
        val Info : TextView = findViewById(R.id.productInfo)
        val image : ImageView = findViewById(R.id.productImage2)

        name.text = categoryType.title
        price.text = categoryType.price
        val resourceId = resources.getIdentifier(categoryType.image,"drawable",packageName)
        val draw = resources.getDrawable(resourceId)
        image?.setImageDrawable(draw)



    }
}