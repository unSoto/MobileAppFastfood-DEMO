package com.fastwood.voodoo.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.NonNull
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.fastwood.voodoo.R
import com.fastwood.voodoo.adapters.HomeHorAdapter
import com.fastwood.voodoo.adapters.HomeVerAdapter
import com.fastwood.voodoo.adapters.UpdateVerticalRec
import com.fastwood.voodoo.databinding.FragmentHomeBinding
import com.fastwood.voodoo.models.HomeHorModel
import com.fastwood.voodoo.models.HomeVerModel

class HomeFragment : Fragment(), UpdateVerticalRec {

    private var _binding: FragmentHomeBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        @NonNull
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {

        _binding = FragmentHomeBinding.inflate(inflater, container, false)

        val homeHorizontalRec: RecyclerView =
            _binding!!.root.findViewById(R.id.home_hor_rec) //Horizontal

        val homeVerticalRec: RecyclerView =
            _binding!!.root.findViewById(R.id.home_ver_rec) //Vertical



        /**
         *
         * Horizontal RecycleView
         *
         */

        homeHorizontalRec.layoutManager =
            LinearLayoutManager(activity, LinearLayoutManager.HORIZONTAL, false)

        homeHorizontalRec.adapter = HomeHorAdapter(requireActivity(), fetchList(), this)

        homeHorizontalRec.setHasFixedSize(true)
        homeHorizontalRec.isNestedScrollingEnabled = false

        /**
         *
         * Vertical RecycleView
         *
         */

        homeVerticalRec.layoutManager =
            LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)

        homeVerticalRec.adapter = HomeVerAdapter(requireActivity(), fetchListVer())



        return binding.root
    }

    /**
     *
     * Horizontal RecycleView
     *
     */

    private fun fetchList(): ArrayList<HomeHorModel> {
        val list = arrayListOf<HomeHorModel>()

        val imageList = intArrayOf(
            R.drawable.img3,
            R.drawable.img4,
            R.drawable.img5,
            R.drawable.img1,
            R.drawable.img2
        )

        val nameImageList = arrayOf("Пицца", "Бургеры", "Гриль", "Десерты", "Напитки")

        for (i in 0..4) {
            val model = HomeHorModel(
                imageList[i], "${nameImageList[i]}"
            )
            list.add(model)
        }
        return list
    }

    /**
     *
     * Vertical RecycleView
     *
     */

    private fun fetchListVer(): ArrayList<HomeVerModel> {
        return arrayListOf()
    }

    override fun callBack(position: Int, list: ArrayList<HomeVerModel>) {

        var homeVerticalRec: RecyclerView =
            _binding!!.root.findViewById(R.id.home_ver_rec)

        homeVerticalRec.adapter = HomeVerAdapter(context, list)
        homeVerticalRec.adapter!!.notifyDataSetChanged()
        homeVerticalRec.adapter = homeVerticalRec.adapter
    }


}