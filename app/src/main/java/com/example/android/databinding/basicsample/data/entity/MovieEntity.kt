package com.example.android.databinding.basicsample.data.entity

import android.widget.ImageView
import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import androidx.databinding.BindingAdapter
import androidx.databinding.library.baseAdapters.BR
import com.bumptech.glide.Glide


class MovieEntity(
        _runtime: Int,
        _genre: String,
        _posterPath: String,
        _backdrop_path: String,
        _title: String,
        _voteAverage: Float,
        _overview: String,
        _realeseDate: String
) : BaseObservable(){

    @get : Bindable
    var title : String = _title
    set(value){
        field = value
        notifyPropertyChanged(BR.title)
    }

    @get : Bindable
    var genre : String = _genre
    set(value){
        field = value
        notifyPropertyChanged(BR.genre)
    }

    @get : Bindable
    var runtime : Int = _runtime
    set(value){
        field = value
        notifyPropertyChanged(BR.runtime)
    }

    @get : Bindable
    var overview : String = _overview
    set(value){
        field = value
        notifyPropertyChanged(BR.overview)
    }

    @get : Bindable
    var voteAverage : Float = _voteAverage
    set(value) {
        field = value
        notifyPropertyChanged(BR.voteAverage)
    }

    @get : Bindable
    var realeseDate : String = _realeseDate
    set(value) {
        field = value
        notifyPropertyChanged(BR.realeseDate)
    }

    @get : Bindable
    var posterPath : String = _posterPath


    @get : Bindable
    var backdropPath : String = _backdrop_path



    companion object{
        @JvmStatic
        @BindingAdapter("imagePosterPath")
        fun loadImagePosterPath(img: ImageView, posterPath: String) {
            Glide.with(img.context)
                    .load("http://image.tmdb.org/t/p/w500"+posterPath)
                    .into(img)
        }
        @JvmStatic
        @BindingAdapter("imageBackdropPath")
        fun loadImageBackdrpPath(img: ImageView, backdropPath: String) {
            Glide.with(img.context)
                    .load("http://image.tmdb.org/t/p/w500"+backdropPath)
                    .into(img)
        }

    }

}