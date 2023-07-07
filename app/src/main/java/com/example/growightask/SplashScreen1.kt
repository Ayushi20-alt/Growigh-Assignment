package com.example.growightask

import android.content.Context
import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController

// TODO: Rename parameter arguments, choose names that match

class SplashScreen1 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        Handler().postDelayed(
            {

                    findNavController().navigate(R.id.action_splashScreen1_to_viewpagerfrag)
                

//            findNavController().navigate(R.id.action_splashScreen1_to_viewpagerfrag)

            }, 3000
        )
        return inflater.inflate(R.layout.fragment_splash_screen1, container, false)
        return view
    }

    private fun onBoardingFinished(): Boolean {
        val sharedPref = requireActivity().getSharedPreferences("onBoarding", Context.MODE_PRIVATE)
        return sharedPref.getBoolean("Finished", true)
    }
}