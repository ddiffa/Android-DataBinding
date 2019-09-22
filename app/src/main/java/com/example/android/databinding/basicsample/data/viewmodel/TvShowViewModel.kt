package com.example.android.databinding.basicsample.data.viewmodel

import androidx.lifecycle.ViewModel
import com.example.android.databinding.basicsample.BaseApplication
import com.example.android.databinding.basicsample.data.entity.TvShowEntity

class TvShowViewModel : ViewModel() {

    fun getDataTvShow(): ArrayList<TvShowEntity> {
        return BaseApplication.INSTANCE.getAppComponent().getTvShowRepository().getTvShow()
    }

    fun getDataTvShowByTitle(title: String): TvShowEntity? {
        return BaseApplication.INSTANCE.getAppComponent().getTvShowRepository().getTvShowByTitle(title)
    }
}