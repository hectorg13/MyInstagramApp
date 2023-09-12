package com.smartsolution.myinstagramapp.ui.search.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.smartsolution.myinstagramapp.R
import com.smartsolution.myinstagramapp.data.Constants
import com.smartsolution.myinstagramapp.databinding.ItemGridBinding
import com.smartsolution.myinstagramapp.data.PostData

class ExplorerAdapter(private val posts: List<PostData>) :
    RecyclerView.Adapter<ExplorerViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExplorerViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ExplorerViewHolder(layoutInflater.inflate(R.layout.item_grid, parent, false))
    }

    override fun onBindViewHolder(holder: ExplorerViewHolder, position: Int) {
        val item = posts[position]
        holder.render(item)
    }

    override fun getItemCount(): Int = posts.size
}

class ExplorerViewHolder(view: View) : ViewHolder(view) {
    val binding = ItemGridBinding.bind(view)
    fun render(item: PostData) {
        Glide.with(itemView.context).load(item.image)
            .apply(RequestOptions().override(Constants.GRID_4_POST_WIDTH, Constants.GRID_4_POST_HEIGHT))
            .into(binding.ivGridItem)
    }
}