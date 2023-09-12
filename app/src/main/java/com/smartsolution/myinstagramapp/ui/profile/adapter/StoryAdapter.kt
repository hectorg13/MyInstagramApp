package com.smartsolution.myinstagramapp.ui.profile.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.smartsolution.myinstagramapp.R
import com.smartsolution.myinstagramapp.data.Constants
import com.smartsolution.myinstagramapp.data.PostData
import com.smartsolution.myinstagramapp.databinding.ItemStoryBinding

class StoryAdapter(private val story: List<PostData>) : RecyclerView.Adapter<StoryViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StoryViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return StoryViewHolder(layoutInflater.inflate(R.layout.item_story, parent, false))
    }

    override fun onBindViewHolder(holder: StoryViewHolder, position: Int) {
        val item = story[position]
        holder.render(item)
    }

    override fun getItemCount(): Int = story.size
}

class StoryViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val binding = ItemStoryBinding.bind(view)
    fun render(item: PostData) {
        Glide.with(itemView.context).load(item.image).into(binding.ivStoryItem)
    }
}