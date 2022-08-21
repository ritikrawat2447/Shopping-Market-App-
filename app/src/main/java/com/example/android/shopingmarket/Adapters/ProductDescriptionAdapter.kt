package com.example.android.shopingmarket.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.android.shopingmarket.Models.Products
import com.example.android.shopingmarket.R

class ProductDescriptionAdapter(val context : Context, val products : List<Products>) : RecyclerView.Adapter<ProductDescriptionAdapter.ProductHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.activity_product_description,parent,false)
        return ProductHolder(view)
    }

    override fun onBindViewHolder(holder: ProductHolder, position: Int) {
        holder?.bindProduct(products[position],context)
    }

    override fun getItemCount(): Int {
        return products.count()
    }

    inner class ProductHolder(itemView: View?) : RecyclerView.ViewHolder(itemView!!){

        val productImage = itemView?.findViewById<ImageView>(R.id.productImage2)
        val productName = itemView?.findViewById<TextView>(R.id.productName2)
        val productPrice = itemView?.findViewById<TextView>(R.id.productPrice2)

        fun bindProduct(product : Products,context: Context ){
            val resourceId = context.resources.getIdentifier(product.image , "drawable" , context.packageName)
            productImage?.setImageResource(resourceId)
            productName?.text = product.title
            productPrice?.text = product.price
        }
    }

}