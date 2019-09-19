package com.example.android.databinding.basicsample.ui.movie


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.android.databinding.basicsample.R
import com.example.android.databinding.basicsample.adapter.MovieAdapter
import com.example.android.databinding.basicsample.databinding.FragmentMovieBinding
import com.example.android.databinding.basicsample.util.generateDummyMovie


class MovieFragment : Fragment() {

    private lateinit var binding: FragmentMovieBinding

    companion object {
        @JvmStatic
        fun getInstance(): Fragment {
            return MovieFragment()
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_movie, container, false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val adapter = MovieAdapter(generateDummyMovie())
        binding.adapter = adapter
    }


}
