package com.example.android.databinding.basicsample.ui.movie


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.example.android.databinding.basicsample.BaseApplication
import com.example.android.databinding.basicsample.R
import com.example.android.databinding.basicsample.adapter.MovieAdapter
import com.example.android.databinding.basicsample.data.viewmodel.MovieViewModel
import com.example.android.databinding.basicsample.databinding.FragmentMovieBinding


class MovieFragment : Fragment() {

    private lateinit var binding: FragmentMovieBinding
    private lateinit var viewModel: MovieViewModel

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
        val appComponent = BaseApplication.INSTANCE.getAppComponent()
        viewModel = ViewModelProviders.of(this)[MovieViewModel::class.java]
        val adapter = MovieAdapter(viewModel.getListMovie(appComponent))
        binding.adapter = adapter
    }


}
