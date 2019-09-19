package com.example.android.databinding.basicsample.data.viewmodel

import androidx.lifecycle.ViewModel
import com.example.android.databinding.basicsample.BaseApplication
import com.example.databindingviewmodel.data.entity.MovieEntity

class MovieViewModel : ViewModel() {

    fun getListMovie(): ArrayList<MovieEntity> {
        return BaseApplication.INSTANCE.getAppComponent().getMovieRepository().getMovieData()
    }

}