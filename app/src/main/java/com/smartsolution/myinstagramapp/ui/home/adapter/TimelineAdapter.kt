package com.smartsolution.myinstagramapp.ui.home.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.smartsolution.myinstagramapp.R
import com.smartsolution.myinstagramapp.databinding.ItemPostBinding
import com.smartsolution.myinstagramapp.data.PostData


class TimelineAdapter(private val posts: List<PostData>) :
    RecyclerView.Adapter<TimelineViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TimelineViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return TimelineViewHolder(layoutInflater.inflate(R.layout.item_post, parent, false))
    }

    override fun onBindViewHolder(holder: TimelineViewHolder, position: Int) {
        val item = posts[position]
        holder.render(item)
    }

    override fun getItemCount(): Int = posts.size

}

class TimelineViewHolder(view: View) : ViewHolder(view) {
    val binding = ItemPostBinding.bind(view)
    fun render(item: PostData) {
        binding.tvUserTitle.text = item.user
        Glide.with(itemView.context).load(item.image).into(binding.ivPost)
    }
}