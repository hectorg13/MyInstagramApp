package com.smartsolution.myinstagramapp.ui.profile.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.smartsolution.myinstagramapp.R
import com.smartsolution.myinstagramapp.data.Constants
import com.smartsolution.myinstagramapp.data.PostData
import com.smartsolution.myinstagramapp.databinding.ItemGridBinding

class ProfileAdapter(private val posts: List<PostData>) :
    RecyclerView.Adapter<ProfileViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProfileViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ProfileViewHolder(layoutInflater.inflate(R.layout.item_grid, parent, false))
    }

    override fun onBindViewHolder(holder: ProfileViewHolder, position: Int) {
        val item = posts[position]
        holder.render(item)
    }

    override fun getItemCount(): Int = posts.size
}

class ProfileViewHolder(view: View) : ViewHolder(view) {
    val binding = ItemGridBinding.bind(view)
    fun render(item: PostData) {
        Glide.with(itemView.context).load(item.image)
            .apply(RequestOptions().override(Constants.GRID_3_POST_WIDTH, Constants.GRID_3_POST_HEIGHT))
            .into(binding.ivGridItem)
    }
}