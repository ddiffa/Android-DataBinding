package com.example.android.databinding.basicsample.data.entity

import android.widget.ImageView
import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import androidx.databinding.BindingAdapter
import androidx.databinding.library.baseAdapters.BR
import com.bumptech.glide.Glide


class TvShowEntity(
        _backdropPathTV: String,
        _firstAirDateTV: String,
        _genresTV: String,
        _titleYV: String,
        _episodeTV: Int,
        _seasonTV: Int,
        _overviewTV: String,
        _posterPathTV: String,
        _voteAverageTV: Float
) : BaseObservable() {
    @get : Bindable
    var titleTV: String = _titleYV
        set(value) {
            field = value
            notifyPropertyChanged(BR.titleTV)
        }

    @get : Bindable
    var genreTV: String = _genresTV
        set(value) {
            field = value
            notifyPropertyChanged(BR.genreTV)
        }

    @get : Bindable
    var episodeTV: Int = _episodeTV
        set(value) {
            field = value
            notifyPropertyChanged(BR.episodeTV)
        }

    @get : Bindable
    var seasonTV: Int = _seasonTV
        set(value) {
            field = value
            notifyPropertyChanged(BR.seasonTV)
        }

    @get : Bindable
    var overviewTV: String = _overviewTV
        set(value) {
            field = value
            notifyPropertyChanged(BR.overviewTV)
        }

    @get : Bindable
    var voteAverageTV: Float = _voteAverageTV
        set(value) {
            field = value
            notifyPropertyChanged(BR.voteAverageTV)
        }

    @get : Bindable
    var firstAirDateTV: String = _firstAirDateTV
        set(value) {
            field = value
            notifyPropertyChanged(BR.firstAirDateTV)
        }

    var posterPathTV: String = _posterPathTV


    var backdropPathTV: String = _backdropPathTV


    companion object {
        @JvmStatic
        @BindingAdapter("imagePosterPathTV")
        fun loadImagePosterPathTV(img: ImageView, posterPath: String) {
            Glide.with(img.context)
                    .load("http://image.tmdb.org/t/p/w500"+posterPath)
                    .into(img)
        }

        @JvmStatic
        @BindingAdapter("imageBackdropPathTV")
        fun loadImageBackdropPathTV(img: ImageView, backdropPath: String) {
            Glide.with(img.context)
                    .load("http://image.tmdb.org/t/p/w500"+backdropPath)
                    .into(img)
        }

    }
}
