package com.example.android.databinding.basicsample.ui.tvshow


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.example.android.databinding.basicsample.BaseApplication
import com.example.android.databinding.basicsample.R
import com.example.android.databinding.basicsample.adapter.TvShowAdapter
import com.example.android.databinding.basicsample.data.viewmodel.TvShowViewModel
import com.example.android.databinding.basicsample.databinding.FragmentTvshowBinding

class TVShowFragment : Fragment() {

    private lateinit var binding: FragmentTvshowBinding
    private lateinit var viewModel: TvShowViewModel

    companion object {
        @JvmStatic
        fun getInstance(): Fragment {
            return TVShowFragment()
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_tvshow, container, false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        val appComponent = BaseApplication.INSTANCE.getAppComponent()

        viewModel = ViewModelProviders.of(this)[TvShowViewModel::class.java]
        val adapter = TvShowAdapter(viewModel.getDataTvShow(appComponent))
        binding.adapter = adapter
    }


}
