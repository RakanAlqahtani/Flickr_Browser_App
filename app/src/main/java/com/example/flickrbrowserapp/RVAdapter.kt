package com.example.flickrbrowserapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.flickrbrowserapp.Model.Image
import kotlinx.android.synthetic.main.items_row.view.*

class RVAdapter(val activity: MainActivity,var photos: ArrayList<Image>):RecyclerView.Adapter<RVAdapter.ItemsViewHolder>() {
    class ItemsViewHolder(item : View): RecyclerView.ViewHolder(item)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemsViewHolder {
        return ItemsViewHolder(LayoutInflater.from(parent.context).inflate(
            R.layout.items_row,
            parent,
            false
        ))
    }

    override fun onBindViewHolder(holder: ItemsViewHolder, position: Int) {

        var text = photos[position].link

        holder.itemView.apply {
        Glide.with(activity).load("$text").into(imageView)
        }
    }

    override fun getItemCount() = photos.size

//    fun update(photos: image) {
//
//        this.photos = photos
//        notifyDataSetChanged()
//
//    }
}