package com.example.android.databinding.basicsample.data.source.impl

import com.example.android.databinding.basicsample.data.source.TvShowRepository
import com.example.android.databinding.basicsample.util.generateDummyTvShow
import com.example.android.databinding.basicsample.util.getTvShow
import com.example.android.databinding.basicsample.data.entity.TvShowEntity

class TvShowRepositoryImpl : TvShowRepository {
    override fun getTvShow(): ArrayList<TvShowEntity> {
        return generateDummyTvShow()
    }

    override fun getTvShowByTitle(title: String): TvShowEntity? {
        return getTvShow(title)
    }
}