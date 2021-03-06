package com.example.android.databinding.basicsample.data.source

import com.example.android.databinding.basicsample.data.entity.MovieEntity

interface MovieRepository {

    fun getMovieData(): ArrayList<MovieEntity>

    fun getMovieDataByTitle(title : String) : MovieEntity?
}