package com.example.android.databinding.basicsample.data.viewmodel

import androidx.lifecycle.ViewModel
import com.example.android.databinding.basicsample.AppComponent
import com.example.android.databinding.basicsample.BaseApplication
import com.example.android.databinding.basicsample.data.entity.TvShowEntity

class TvShowViewModel : ViewModel() {

    fun getDataTvShow(appComponent: AppComponent): ArrayList<TvShowEntity> {
        return appComponent.getTvShowRepository().getTvShow()
    }

    fun getDataTvShowByTitle(title: String, appComponent: AppComponent): TvShowEntity? {
        return appComponent.getTvShowRepository().getTvShowByTitle(title)
    }
}