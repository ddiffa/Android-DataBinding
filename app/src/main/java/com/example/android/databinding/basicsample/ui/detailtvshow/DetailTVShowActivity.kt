package com.example.android.databinding.basicsample.ui.detailtvshow

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.example.android.databinding.basicsample.R
import com.example.android.databinding.basicsample.data.entity.TvShowEntity
import com.example.android.databinding.basicsample.data.viewmodel.TvShowViewModel
import com.example.android.databinding.basicsample.databinding.ActivityDetailTvshowBinding

class DetailTVShowActivity : AppCompatActivity() {

    private lateinit var binding : ActivityDetailTvshowBinding
    private lateinit var viewModel : TvShowViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_detail_tvshow)
        viewModel = ViewModelProviders.of(this)[TvShowViewModel::class.java]
        val model : TvShowEntity? = viewModel.getDataTvShowByTitle(intent.getStringExtra("data"))
        binding.tvDetail = model
        binding.imageBackdropTV = model?.backdropPathTV
        binding.imageCirclePosterTV = model?.posterPathTV
    }
}
