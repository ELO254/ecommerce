package com.example.foodecommerce

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView

class productAdapter (private var products: List<product>): RecyclerView.Adapter<productAdapter.productViewHolder>() {
    class productViewHolder(itemview: View) :RecyclerView.ViewHolder(itemview){
        private val imageproduct: ImageView = itemview.findViewById(R.id.imageProduct)
        private val textProductName: TextView = itemview.findViewById(R.id.textProductName)
        private val tesxtProductPrice: TextView = itemview.findViewById(R.id.textProductPrice)

        fun bind(product: product) {
           imageproduct.setImageResource(product.image)
           textProductName.text = product.name
           tesxtProductPrice.text = "Price:${product.price}"

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): productViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.recycleviewlayout, parent,false)
        return productViewHolder(view)
    }

    override fun getItemCount(): Int {
        return products.size
    }

    override fun onBindViewHolder(holder: productViewHolder, position: Int) {
        var product = products[position]
        holder.bind(product)
    }
}