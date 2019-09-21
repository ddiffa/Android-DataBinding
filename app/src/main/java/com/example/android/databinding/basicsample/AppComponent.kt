package com.example.android.databinding.basicsample

import com.example.android.databinding.basicsample.data.source.MovieRepository
import com.example.android.databinding.basicsample.data.source.TvShowRepository
import com.example.android.databinding.basicsample.data.source.impl.MovieRepositoryImpl
import com.example.android.databinding.basicsample.data.source.impl.TvShowRepositoryImpl

class AppComponent {

    private val movieRepository = MovieRepositoryImpl()
    private val tvShowRepository = TvShowRepositoryImpl()
    fun getMovieRepository(): MovieRepository {
        return movieRepository
    }

    fun getTvShowRepository(): TvShowRepository {
        return tvShowRepository
    }
}