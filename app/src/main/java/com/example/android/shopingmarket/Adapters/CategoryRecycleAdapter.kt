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

class CategoryRecycleAdapter(val context: Context,val categories: List<Products> , val itemClick : (Products) -> Unit) : RecyclerView.Adapter<CategoryRecycleAdapter.Holder>( ) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryRecycleAdapter.Holder {
        val view = LayoutInflater.from(context).inflate(R.layout.category_list_item,parent,false)
        return Holder(view,itemClick )
    }

    override fun onBindViewHolder(holder: CategoryRecycleAdapter.Holder, position: Int) {
        holder?.bindCategory(categories[position],context)
    }

    override fun getItemCount(): Int {
        return categories.count()
    }

    inner class Holder(itemView : View?, val itemClick: (Products) -> kotlin.Unit ) : RecyclerView.ViewHolder(itemView!!){
        val categoryImage = itemView?.findViewById<ImageView>(R.id.categoryImage)
        val categoyName = itemView?.findViewById<TextView>(R.id.categoryName)

        fun bindCategory(category : Products,context : Context ) {
            val resourceId = context.resources.getIdentifier(category.image, "drawable", context.packageName)
            categoryImage?.setImageResource(resourceId)
            categoyName?.text = category.title
            itemView.setOnClickListener { itemClick(category) }
        }


    }


}