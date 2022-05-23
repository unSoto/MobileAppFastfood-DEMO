package com.fastwood.voodoo.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.fastwood.voodoo.R
import com.fastwood.voodoo.adapters.DetailedDailyAdapter
import com.fastwood.voodoo.models.DetailedDailyModel

class DetailedDailyMealActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailed_daily_meal)

        var detailedDailyModelList: List<DetailedDailyModel>

        val type: String? = intent.getStringExtra("type")

        var recyclerView: RecyclerView = findViewById(R.id.detailed_rec)
        var imageView: ImageView = findViewById(R.id.detailed_img)

        recyclerView.layoutManager = LinearLayoutManager(this)
        detailedDailyModelList = ArrayList()
        var dailyAdapter: DetailedDailyAdapter = DetailedDailyAdapter(detailedDailyModelList)
        recyclerView.adapter = dailyAdapter

        if (type != null && type.equals("hotsets", false)) {

            detailedDailyModelList.add(DetailedDailyModel(R.drawable.fav1,
                "Гамбургер + картофель фри",
                "Гамбургер и картофель фри по выгодной цене",
                "4.9",
                "250",
                "25 мин."))
            detailedDailyModelList.add(DetailedDailyModel(R.drawable.fav2,
                "Твистеры х2",
                "Два твистера по цене одного",
                "4.4",
                "169",
                "20 мин."))
            detailedDailyModelList.add(DetailedDailyModel(R.drawable.fav3,
                "Баскет фри",
                "Большой картофель фри по выгодной цене",
                "4.3",
                "99",
                "10 мин."))
            dailyAdapter.notifyDataSetChanged()
        }

        if (type != null && type.equals("sweetsset", true)) {

            imageView.setImageResource(R.drawable.daily2)

            detailedDailyModelList.add(DetailedDailyModel(R.drawable.fav4,
                "Breakfast",
                "Описание",
                "4.4",
                "50",
                "50 мин."))
            detailedDailyModelList.add(DetailedDailyModel(R.drawable.fav5,
                "Breakfast",
                "Описание",
                "4.4",
                "50",
                "50 мин."))
            detailedDailyModelList.add(DetailedDailyModel(R.drawable.fav6,
                "Breakfast",
                "Описание",
                "4.4",
                "50",
                "50 мин."))
            dailyAdapter.notifyDataSetChanged()
        }

        if (type != null && type.equals("sweets", true)) {

            imageView.setImageResource(R.drawable.daily2)

            detailedDailyModelList.add(DetailedDailyModel(R.drawable.fav4,
                "Breakfast",
                "Описание",
                "4.4",
                "50",
                "50 мин."))
            detailedDailyModelList.add(DetailedDailyModel(R.drawable.fav5,
                "Breakfast",
                "Описание",
                "4.4",
                "50",
                "50 мин."))
            detailedDailyModelList.add(DetailedDailyModel(R.drawable.fav6,
                "Breakfast",
                "Описание",
                "4.4",
                "50",
                "50 мин."))
            dailyAdapter.notifyDataSetChanged()
        }
    }
}