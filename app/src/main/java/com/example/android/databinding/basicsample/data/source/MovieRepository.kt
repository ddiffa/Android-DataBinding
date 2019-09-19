package com.example.android.databinding.basicsample.data.source

import com.example.databindingviewmodel.data.entity.MovieEntity

interface MovieRepository {

    fun getMovieData(): ArrayList<MovieEntity>

    fun getMovieDataByName(name : String) : ArrayList<MovieEntity>
}