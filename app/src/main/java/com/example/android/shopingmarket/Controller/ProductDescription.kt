package com.example.android.shopingmarket.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.android.shopingmarket.Models.Products
import com.example.android.shopingmarket.R
import com.example.android.shopingmarket.Utilties.EXTRA_PRODUCTS

class ProductDescription : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_description)

        val categoryType = intent.getParcelableExtra<Products>(EXTRA_PRODUCTS)!!

    }
}