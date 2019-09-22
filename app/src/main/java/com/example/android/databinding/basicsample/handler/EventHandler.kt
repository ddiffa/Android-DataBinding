package com.example.databindingviewmodel.handler

import android.content.Context
import android.content.Intent
import com.example.android.databinding.basicsample.ui.detailmovie.DetailMovieActivity

open class EventHandler(context: Context) {

    val mContext: Context = context


    fun onMovieDetailsClick(title: String) {
        val intent = Intent(mContext,DetailMovieActivity::class.java)
        intent.putExtra("data",title)
        mContext.startActivity(intent)
    }

    fun onTvShowDetailsClick(title : String){

    }
}