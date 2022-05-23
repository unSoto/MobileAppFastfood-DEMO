package com.fastwood.voodoo.ui.favourite

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.NonNull
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.viewpager2.widget.ViewPager2
import com.fastwood.voodoo.R
import com.fastwood.voodoo.databinding.FragmentFavouriteBinding
import com.fastwood.voodoo.fragments.FragmentAdapter
import com.google.android.material.tabs.TabLayout

class FavouriteFragment() : Fragment() {

    private var _binding: FragmentFavouriteBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        @NonNull
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {

        /*
        var tableLayout: TableLayout
        var viewPager2: ViewPager2
        var fragmentAdapter: FragmentAdapter
        var myContext: FragmentActivity
         */

        _binding = FragmentFavouriteBinding.inflate(inflater, container, false)

        val tabLayout: TabLayout = binding.root.findViewById(R.id.tab_layout)
        val viewPager2: ViewPager2 = binding.root.findViewById(R.id.view_pager2)

        val fm: FragmentManager = requireActivity().supportFragmentManager
        val fragmentAdapter: FragmentAdapter = FragmentAdapter(fm, lifecycle)

        viewPager2.adapter = fragmentAdapter

        tabLayout.addTab(tabLayout.newTab().setText("Рекомендуем"))
        tabLayout.addTab(tabLayout.newTab().setText("Популярное"))
        tabLayout.addTab(tabLayout.newTab().setText("NEW"))

        tabLayout.addOnTabSelectedListener(object: TabLayout.OnTabSelectedListener
        {
            override fun onTabReselected(tab: TabLayout.Tab) {
            }

            override fun onTabUnselected(tab: TabLayout.Tab){

            }

            override fun onTabSelected(tab: TabLayout.Tab) {
                viewPager2.currentItem = tab.position
            }

        })

        viewPager2.registerOnPageChangeCallback(object: ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                tabLayout.selectTab(tabLayout.getTabAt(position))
            }
        })

            return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}