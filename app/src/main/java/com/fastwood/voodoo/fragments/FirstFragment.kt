package com.fastwood.voodoo.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.fastwood.voodoo.R
import com.fastwood.voodoo.adapters.FeaturedAdapter
import com.fastwood.voodoo.adapters.FeaturedVerAdapter
import com.fastwood.voodoo.models.FeaturedModel
import com.fastwood.voodoo.models.FeaturedVerModel

class FirstFragment() : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {

        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_first, container, false)


        ////Featured Hor RecyclerView

        var featuredModelsList: List<FeaturedModel>

        var recyclerView: RecyclerView = view.findViewById(R.id.featured_hor_rec)
        recyclerView.layoutManager = LinearLayoutManager(context, RecyclerView.HORIZONTAL, false)
        featuredModelsList = ArrayList()

        featuredModelsList.add(FeaturedModel(R.drawable.fav1, "Комбо", "Гамбургер и картофель фри"))
        featuredModelsList.add(FeaturedModel(R.drawable.fav2, "Твистеры х2", "Два твистера по цене одного"))
        featuredModelsList.add(FeaturedModel(R.drawable.fav3, "Большой картофель фри", "Двойная порция картофеля фри"))

        var featuredAdapter: FeaturedAdapter = FeaturedAdapter(featuredModelsList)
        recyclerView.adapter= featuredAdapter


        ////Featured Ver RecyclerView

        var featuredVerModelsList: List<FeaturedVerModel>

        var recyclerView2: RecyclerView = view.findViewById(R.id.featured_ver_rec)
        recyclerView2.layoutManager = LinearLayoutManager(context, RecyclerView.VERTICAL, false)
        featuredVerModelsList = ArrayList()

        featuredVerModelsList.add(FeaturedVerModel(R.drawable.ver_img1,
            "Пепперони",
            "30 мин.",
            "4.9",
            "450 руб."))
        featuredVerModelsList.add(FeaturedVerModel(R.drawable.ver_img2,
            "4 сыра",
            "40 мин.",
            "4.0",
            "500 руб."))
        featuredVerModelsList.add(FeaturedVerModel(R.drawable.burger4,
            "Комбо х2",
            "20 мин.",
            "4.3",
            "469 руб."))
        featuredVerModelsList.add(FeaturedVerModel(R.drawable.burger3,
            "Горячая цыпа",
            "15 мин.",
            "4.1",
            "209 руб."))
        featuredVerModelsList.add(FeaturedVerModel(R.drawable.jar2,
            "Филе Комбо",
            "15 мин.",
            "4.0",
            "399 руб."))
        featuredVerModelsList.add(FeaturedVerModel(R.drawable.desert1,
            "Шоколадный",
            "30 мин.",
            "4.9",
            "600 руб."))

        var featuredVerAdapter: FeaturedVerAdapter = FeaturedVerAdapter(featuredVerModelsList)
        recyclerView2.adapter= featuredVerAdapter

        return view
    }
}