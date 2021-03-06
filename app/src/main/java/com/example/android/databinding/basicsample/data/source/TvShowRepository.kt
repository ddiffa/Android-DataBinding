package com.example.android.databinding.basicsample.data.source

import com.example.android.databinding.basicsample.data.entity.TvShowEntity

interface TvShowRepository {

    fun getTvShow() : ArrayList<TvShowEntity>

    fun getTvShowByTitle (title : String) : TvShowEntity?
}