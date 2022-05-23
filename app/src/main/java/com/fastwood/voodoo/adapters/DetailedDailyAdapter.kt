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
import com.fastwood.voodoo.models.DetailedDailyModel

class DetailedDailyAdapter(
    private val list: List<DetailedDailyModel>,
) : RecyclerView.Adapter<DetailedDailyAdapter.ViewHolder>() {

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val imageView: ImageView = view.findViewById(R.id.detailed_img)
        val name: TextView = view.findViewById(R.id.detailed_name)
        val price: TextView = view.findViewById(R.id.detailed_price)
        val description: TextView = view.findViewById(R.id.detailed_des)
        val rating: TextView = view.findViewById(R.id.detailed_rating)
        val timing: TextView = view.findViewById(R.id.detailed_timing)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.detailed_daily_meal_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val data = list[position]
        holder.imageView.setImageResource(data.image)
        holder.name.text = data.name
        holder.price.text = data.price
        holder.description.text = data.description
        holder.timing.text = data.timing
        holder.rating.text = data.rating
    }

    override fun getItemCount(): Int {

        return list.count()
    }
}