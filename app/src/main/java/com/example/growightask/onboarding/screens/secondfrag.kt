package com.example.growightask.onboarding.screens

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.viewpager2.widget.ViewPager2
import com.example.growightask.R
import com.mikhaellopez.circularprogressbar.CircularProgressBar

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class secondfrag : Fragment() {


    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view : View = inflater.inflate(R.layout.fragment_secondfrag, container, false)

        val viewpager = activity?.findViewById<ViewPager2>(R.id.viewpager)
        val button2  = view.findViewById<ImageView>(R.id.button2)


        if (button2 != null) {
            button2.setOnClickListener {
                if (viewpager != null) {
                    viewpager.currentItem = 2
                }
            }
        }


        val progress_bar : CircularProgressBar = view.findViewById(R.id.circularProgressBar)
        progress_bar.apply {
            progressMax = 100f
            progress = 50f
            setProgressWithAnimation(75f, 3000)
            progressBarWidth = 2f
            backgroundProgressBarWidth = 3f
            progressBarColor = Color.WHITE
        }


        return view
    }

}