package com.example.android.databinding.basicsample.data.source.impl

import com.example.android.databinding.basicsample.data.source.MovieRepository
import com.example.android.databinding.basicsample.util.generateDummyMovie
import com.example.android.databinding.basicsample.util.getMovie
import com.example.android.databinding.basicsample.data.entity.MovieEntity

class MovieRepositoryImpl : MovieRepository {
    override fun getMovieDataByTitle(title: String): MovieEntity? {
        return getMovie(title)
    }

    override fun getMovieData(): ArrayList<MovieEntity> {
        return generateDummyMovie()
    }


}