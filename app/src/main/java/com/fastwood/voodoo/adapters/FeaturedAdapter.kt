package com.fastwood.voodoo.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.fastwood.voodoo.R
import com.fastwood.voodoo.models.FeaturedModel
import kotlinx.coroutines.NonDisposableHandle.parent

class FeaturedAdapter(private val list: List<FeaturedModel>) :
    RecyclerView.Adapter<FeaturedAdapter.ViewHolder>() {

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val image: ImageView = view.findViewById(R.id.featured_img)
        val name: TextView = view.findViewById(R.id.featured_name)
        val desc: TextView = view.findViewById(R.id.featured_des)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.featured_hor_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = list[position]
        holder.image.setImageResource(list[position].image)
        holder.name.text = data.name
        holder.desc.text = data.desc
    }

    override fun getItemCount(): Int {
        return list.count()
    }
}