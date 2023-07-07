package com.example.growightask

import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.RecyclerView
import coil.load
import okhttp3.Call
import okhttp3.Callback
import okhttp3.HttpUrl
import okhttp3.HttpUrl.Companion.toHttpUrl
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Response
import org.json.JSONArray
import java.io.IOException

class feeds_frag : Fragment() {

    private lateinit var  recyclerView: RecyclerView

    @RequiresApi(Build.VERSION_CODES.O)
    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view : View = inflater.inflate(R.layout.fragment_feeds_frag, container, false)

//        val autofillManager: AutofillManager? =
//            context?.getSystemService(AutofillManager::class.java)
//        if (autofillManager != null) {
//            autofillManager.disableAutofillServices( )
//        }


        recyclerView = view.findViewById(R.id.recyclerView)

        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = null


        val request = Request.Builder()
            .url("https://picsum.photos/200")
            .build()

        val myadapter = MyAdapter()
        recyclerView.adapter = myadapter
        myadapter.notifyDataSetChanged()

//       val okHttpClient = OkHttpClient()
//        okHttpClient.newCall(request).enqueue(object : Callback{
//            override fun onFailure(call: Call, e: IOException) {
//                Log.d("Main",e.message ?: "Something Went worng")
//            }
//
//            @SuppressLint("NotifyDataSetChanged")
//            override fun onResponse(call: Call, response: Response) {
//                val profileArrayList = fetchProfileArrayList(response)
//                getActivity()?.runOnUiThread {
//
//                }
//            }
//
//        })

        return view
    }
}

//    private fun fetchProfileArrayList(response: Response): ArrayList<Profile> {
//             val arrayList = ArrayList<Profile>()
//            val jsonArray = JSONArray(response.body?.string())
//
//        for(item in 0 until jsonArray.length())
//        {
//            val jsonObject = jsonArray.getJSONObject(item)
//            val photoUrl = jsonObject.get("download_url").toString()
//            arrayList += Profile(photoUrl)
//        }
//        return arrayList
//    }



class MyAdapter( ) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val itemrow = layoutInflater.inflate(R.layout.item_row, parent, false)
        return MyViewHolder(itemrow)
    }

    override fun getItemCount(): Int = 10

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        holder.photo.load("https://picsum.photos/200") {
            size(364, 254)
        }
    }

    class MyViewHolder(private val itemView: View) : RecyclerView.ViewHolder(itemView) {
        var photo: ImageView = itemView.findViewById(R.id.shapeableImageView2)
    }
}

