package com.example.growightask.onboarding.screens

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.viewpager2.widget.ViewPager2
import com.example.growightask.R
import com.mikhaellopez.circularprogressbar.CircularProgressBar


class firstfrag : Fragment() {


    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view : View =  inflater.inflate(R.layout.fragment_firstfrag, container, false)

        val viewpager = activity?.findViewById<ViewPager2>(R.id.viewpager)
        val button1  = view.findViewById<ImageView>(R.id.button1)

        if (button1 != null) {
            button1.setOnClickListener {
                if (viewpager != null) {
                    viewpager.currentItem = 1
                }
            }
        }
        val progress_bar : CircularProgressBar = view.findViewById(R.id.circularProgressBar)
        progress_bar.apply {
            progressMax = 100f
            setProgressWithAnimation(50f, 3000)
            progressBarWidth = 2f
            backgroundProgressBarWidth = 3f
            progressBarColor = Color.WHITE
        }



        return view
    }

}