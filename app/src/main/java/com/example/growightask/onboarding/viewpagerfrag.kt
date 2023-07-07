package com.example.growightask.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.example.growightask.R
import com.example.growightask.onboarding.screens.firstfrag
import com.example.growightask.onboarding.screens.secondfrag
import com.example.growightask.onboarding.screens.thirdfrag

class viewpagerfrag : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view : View = inflater.inflate(R.layout.fragment_viewpagerfrag, container, false)

        val fragmentlist  = arrayListOf<Fragment>(
            firstfrag(),
            secondfrag(),
            thirdfrag()
        )

        val adapter = viewPagerAdapter(fragmentlist, requireActivity().supportFragmentManager,lifecycle)

        val viewpager: ViewPager2 = view.findViewById(R.id.viewpager)
        viewpager.adapter = adapter

        return view
    }

}