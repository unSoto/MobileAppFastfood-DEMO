package com.fastwood.voodoo.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.fastwood.voodoo.R
import com.fastwood.voodoo.models.FeaturedModel
import com.fastwood.voodoo.models.FeaturedVerModel

class FeaturedVerAdapter(private val list: List<FeaturedVerModel>): RecyclerView.Adapter<FeaturedVerAdapter.ViewHolder>() {

    inner class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val image: ImageView = view.findViewById(R.id.detailed_img)
        val name: TextView = view.findViewById(R.id.detailed_name)
        val description: TextView = view.findViewById(R.id.detailed_des)
        val rating: TextView = view.findViewById(R.id.detailed_rating)
        val timing: TextView = view.findViewById(R.id.detailed_timing)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.featured_ver_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = list[position]
        holder.image.setImageResource(list[position].image)
        holder.name.text = list[position].name
        holder.description.text = list[position].description
        holder.rating.text = list[position].rating
        holder.timing.text = list[position].timing
    }

    override fun getItemCount(): Int {
        return list.count()
    }
}