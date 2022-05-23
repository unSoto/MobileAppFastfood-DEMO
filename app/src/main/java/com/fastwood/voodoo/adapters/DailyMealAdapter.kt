package com.fastwood.voodoo.adapters

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.fastwood.voodoo.R
import com.fastwood.voodoo.activities.DetailedDailyMealActivity
import com.fastwood.voodoo.models.DailyMealModel

class DailyMealAdapter(
    private val context: Context,
    private val list: List<DailyMealModel>
) : RecyclerView.Adapter<DailyMealAdapter.ViewHolder>() {

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val imageView: ImageView = view.findViewById(R.id.imageview)
        val name: TextView = view.findViewById(R.id.textView9)
        val description: TextView = view.findViewById(R.id.textView10)
        val discount: TextView = view.findViewById(R.id.discount)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DailyMealAdapter.ViewHolder {
        val view =
            LayoutInflater.from(context).inflate(R.layout.daily_meal_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: DailyMealAdapter.ViewHolder, position: Int) {
        val data = list[position]
        holder.imageView.setImageDrawable(ContextCompat.getDrawable(context, data.image))
        holder.name.text = data.name
        holder.description.text = data.description
        holder.discount.text = data.discount

        holder.itemView.setOnClickListener {
            val intent: Intent = Intent(context, DetailedDailyMealActivity::class.java)
            intent.putExtra("type", list[position].type)
            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return list.count()
    }
}