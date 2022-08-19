package com.example.android.shopingmarket.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.android.shopingmarket.Models.Products
import com.example.android.shopingmarket.R

class Cateogory_Adapter(val context: Context, val categories: List<Products>) : BaseAdapter() {

    override fun getCount(): Int {
        return categories.count()
    }

    override fun getItem(position : Int): Any {
        return categories[position]
    }

    override fun getItemId(position : Int): Long {
        return 0
    }

    override fun getView(position : Int, convertView : View?, parent : ViewGroup?): View {
        val cateogoryView: View
        val holder : ViewHolder

        if ( convertView == null ){
            cateogoryView = LayoutInflater.from(context).inflate(R.layout.category_list_item, null )
            holder = ViewHolder()
            holder.categoryImage = cateogoryView.findViewById(R.id.categoryImage)
            holder.categoryName = cateogoryView.findViewById(R.id.categoryName)
            cateogoryView.tag = holder
        }else{
            holder = convertView.tag as ViewHolder
            cateogoryView = convertView
        }

        val category = categories[position]
        val resourceId = context.resources.getIdentifier(category.image,"drawable",context.packageName)
        holder.categoryImage?.setImageResource(resourceId)
        holder.categoryName?.text = category.title
        return cateogoryView
    }

    private class ViewHolder{
        var categoryImage:ImageView? = null
        var categoryName:TextView? = null
    }

}