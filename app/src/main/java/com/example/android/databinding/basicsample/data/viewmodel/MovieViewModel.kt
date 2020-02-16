package com.example.android.databinding.basicsample.data.viewmodel

import androidx.lifecycle.ViewModel
import com.example.android.databinding.basicsample.AppComponent
import com.example.android.databinding.basicsample.data.entity.MovieEntity

class MovieViewModel : ViewModel() {

    fun getListMovie(appComponent: AppComponent): ArrayList<MovieEntity> {
        return appComponent.getMovieRepository().getMovieData()
    }

    fun getMovieByTitle(title: String, appComponent: AppComponent): MovieEntity? {
        return appComponent.getMovieRepository().getMovieDataByTitle(title)
    }
}