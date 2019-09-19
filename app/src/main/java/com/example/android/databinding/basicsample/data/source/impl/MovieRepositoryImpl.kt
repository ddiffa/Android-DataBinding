package com.example.android.databinding.basicsample.data.source.impl

import com.example.android.databinding.basicsample.data.source.MovieRepository
import com.example.android.databinding.basicsample.util.generateDummyMovie
import com.example.databindingviewmodel.data.entity.MovieEntity

class MovieRepositoryImpl : MovieRepository {
    override fun getMovieData(): ArrayList<MovieEntity> {
        return generateDummyMovie()
    }

    override fun getMovieDataByName(name: String): ArrayList<MovieEntity> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}