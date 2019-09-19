package com.example.databindingviewmodel.handler

import android.content.Context
import android.widget.Toast

open class EventHandler(context: Context) {

    val myContext: Context = context


    fun onButtonClick(name : String) {
        Toast.makeText(myContext, "Test $name", Toast.LENGTH_SHORT).show()
    }
}