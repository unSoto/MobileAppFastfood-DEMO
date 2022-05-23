package com.fastwood.voodoo.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.fastwood.voodoo.R
import com.fastwood.voodoo.models.CartModel

class CartAdapter(val list: List<CartModel>): RecyclerView.Adapter<CartAdapter.ViewHolder>() {

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val image: ImageView = view.findViewById(R.id.detailed_img)
        val name: TextView = view.findViewById(R.id.detailed_name)
        val price: TextView = view.findViewById(R.id.textView12)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.mycart_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = list[position]
        holder.image.setImageResource(list[position].image)
        holder.name.text = data.name
        holder.price.text = data.price
    }

    override fun getItemCount(): Int {
        return list.count()
    }
}