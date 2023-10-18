package com.example.freakygallery

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.freakygallery.RecyclerViewAdapter.*
import com.example.freakygallery.databinding.PhotoInstanceBinding

class RecyclerViewAdapter (private val photos: List<Photo>):
    RecyclerView.Adapter<ViewHolder>() {
    class ViewHolder (private val binding: PhotoInstanceBinding){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }
}