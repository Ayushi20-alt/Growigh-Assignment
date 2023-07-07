package com.example.growightask

import android.annotation.SuppressLint
import android.app.Activity.RESULT_OK
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.widget.Toolbar
import androidx.lifecycle.findViewTreeViewModelStoreOwner
import androidx.navigation.fragment.findNavController

class Upload_image_frag : Fragment() {

//    private lateinit var  toolbar: Toolbar
    private lateinit var button : Button
    private lateinit var imageView: ImageView

    companion object{
        val Image_Request_Code = 100
    }

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view : View = inflater.inflate(R.layout.fragment_upload_image_frag, container, false)

        button = view.findViewById(R.id.materialTextView3)
        imageView = view.findViewById(R.id.shapeableImageView)

        button.setOnClickListener {
            pickImageGallery()
        }

        val back : ImageView = view.findViewById(R.id.backarrow2)
        back.setOnClickListener {
            findNavController().navigate(R.id.action_upload_image_frag_to_anonaymous)
        }

        return view
    }

    private fun pickImageGallery() {
        val intent = Intent(Intent.ACTION_PICK)
        intent.type = "image/*"
        startActivityForResult(intent, Image_Request_Code)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if(requestCode == Image_Request_Code && resultCode == RESULT_OK){
            if (data != null) {
                imageView.setImageURI(data.data)
            }
        }
    }

}