package com.example.android.databinding.basicsample

import com.example.android.databinding.basicsample.data.source.MovieRepository
import com.example.android.databinding.basicsample.data.source.impl.MovieRepositoryImpl

class AppComponent {

    private val movieRepository = MovieRepositoryImpl()

    fun getMovieRepository(): MovieRepository {
        return movieRepository
    }
}