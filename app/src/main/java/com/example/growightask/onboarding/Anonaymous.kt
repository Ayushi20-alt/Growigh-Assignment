package com.example.growightask.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import com.example.growightask.R

class Anonaymous : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view : View =  inflater.inflate(R.layout.fragment_anonaymous, container, false)

        val button1 : TextView = view.findViewById(R.id.materialTextView2)

        button1.setOnClickListener {
            findNavController().navigate(R.id.action_anonaymous_to_upload_image_frag)
        }

        val button2 : TextView = view.findViewById(R.id.materialTextView)

        button2.setOnClickListener {
            findNavController().navigate(R.id.action_anonaymous_to_feeds_frag)
        }
        return view
    }


}