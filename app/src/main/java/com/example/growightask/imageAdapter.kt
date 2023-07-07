package com.example.growightask

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import coil.load
import okhttp3.HttpUrl.Companion.toHttpUrl
import java.util.ArrayList

class imageAdapter(val context: Context, val playerList: ArrayList<Profile>):
    RecyclerView.Adapter<imageAdapter.playerViewModel>() {

    class playerViewModel(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val img: ImageView = itemView.findViewById(R.id.shapeableImageView2)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): playerViewModel {
        return playerViewModel(
            LayoutInflater.from(context).inflate(R.layout.item_row, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return playerList.size
    }

    override fun onBindViewHolder(holder: playerViewModel, position: Int) {
        val profile = playerList[position]
        holder.img.load(profile.photourl.toHttpUrl()){
            size(364,254)
        }
    }
}
