package com.fastwood.voodoo.ui.dailymeal

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.annotation.NonNull
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.fastwood.voodoo.R
import com.fastwood.voodoo.adapters.DailyMealAdapter
import com.fastwood.voodoo.databinding.DailyMealFragmentBinding
import com.fastwood.voodoo.models.DailyMealModel

class DailyMealFragment: Fragment() {

    private var _binding: DailyMealFragmentBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        @NonNull
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = DailyMealFragmentBinding.inflate(inflater, container, false)

        var recyclerView: RecyclerView = _binding!!.root.findViewById(R.id.daily_meal_rec)
        recyclerView.layoutManager = LinearLayoutManager(context)
        var dailyMealModels: List<DailyMealModel> = ArrayList()

        (dailyMealModels as ArrayList<DailyMealModel>).add(DailyMealModel(R.drawable.daily1, "Горячие сеты", "Скидка 10% - 50%", "Этот набор понравится", "hotsets"))
        dailyMealModels.add(DailyMealModel(R.drawable.daily5, "Сладкие сеты", "Скидка 10% - 50%", "Этот набор", "sweetsset"))
        dailyMealModels.add(DailyMealModel(R.drawable.daily4, "Завтрак", "Скидка 10% - 30%", "Этот набор", "breakfast"))
        dailyMealModels.add(DailyMealModel(R.drawable.daily3, "Обед", "Скидка 10% - 25%", "Этот набор", "lunch"))
        dailyMealModels.add(DailyMealModel(R.drawable.daily2, "Ужин", "Скидка 10% - 25%", "Этот набор", "вшттук"))

        recyclerView.adapter = DailyMealAdapter(requireContext(), dailyMealModels)
        recyclerView.setAdapter(recyclerView.adapter)
        recyclerView.adapter!!.notifyDataSetChanged()

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}