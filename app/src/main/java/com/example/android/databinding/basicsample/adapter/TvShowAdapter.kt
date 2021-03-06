package com.example.android.databinding.basicsample.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.android.databinding.basicsample.R
import com.example.android.databinding.basicsample.databinding.ItemTvshowBinding
import com.example.android.databinding.basicsample.data.entity.TvShowEntity
import com.example.android.databinding.basicsample.handler.EventHandler

class TvShowAdapter(var list: ArrayList<TvShowEntity>) : RecyclerView.Adapter<TvShowAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = DataBindingUtil.inflate<ItemTvshowBinding>(inflater, R.layout.item_tvshow, parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       holder.bind(list[position])
    }

    class ViewHolder(var binding: ItemTvshowBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(tvShow: TvShowEntity) {
            binding.tvShows = tvShow
            binding.imagePosterPathTV = tvShow.posterPathTV
            binding.handler = EventHandler(binding.root.context)
        }

    }

}