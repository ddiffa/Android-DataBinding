package com.example.android.databinding.basicsample.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.android.databinding.basicsample.R
import com.example.android.databinding.basicsample.databinding.ItemMoviesBinding
import com.example.android.databinding.basicsample.data.entity.MovieEntity
import com.example.databindingviewmodel.handler.EventHandler

class MovieAdapter(var list: ArrayList<MovieEntity>) : RecyclerView.Adapter<MovieAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)

        val binding = DataBindingUtil.inflate<ItemMoviesBinding>(inflater, R.layout.item_movies, parent, false)

        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(list[position])
    }

    class ViewHolder(var dataBinding: ItemMoviesBinding) : RecyclerView.ViewHolder(dataBinding.root) {
        fun bind(movieEntity: MovieEntity) {
            dataBinding.movie = movieEntity
            dataBinding.imagePosterPath = "http://image.tmdb.org/t/p/w500"+movieEntity.posterPath
            dataBinding.handler = EventHandler(dataBinding.root.context)
        }

    }
}