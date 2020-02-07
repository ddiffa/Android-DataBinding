package com.example.android.databinding.basicsample.ui.detailmovie

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.example.android.databinding.basicsample.R
import com.example.android.databinding.basicsample.data.entity.MovieEntity
import com.example.android.databinding.basicsample.data.viewmodel.MovieViewModel
import com.example.android.databinding.basicsample.databinding.ActivityDetailMovieBinding
import com.example.android.databinding.basicsample.util.convertRuntime
import kotlinx.android.synthetic.main.activity_detail_movie.*

class DetailMovieActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailMovieBinding
    private lateinit var viewModel: MovieViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_detail_movie)
        viewModel = ViewModelProviders.of(this)[MovieViewModel::class.java]
        val model: MovieEntity? = viewModel.getMovieByTitle(intent.getStringExtra("data"))
        binding.moviesDetail = model
        binding.imageBackdrop = model?.backdropPath
        binding.imageCirclePoster = model?.posterPath
        binding.tvRuntime = convertRuntime(model?.runtime.toString())
        imgBack.setOnClickListener { onBackPressed() }
    }
}
