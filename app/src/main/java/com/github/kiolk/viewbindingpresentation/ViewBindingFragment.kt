package com.github.kiolk.viewbindingpresentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.github.kiolk.viewbindingpresentation.databinding.FragmentLayoutBinding

class ViewBindingFragment : Fragment() {

    private var _viewBinding: FragmentLayoutBinding? = null
    private val viewBinding: FragmentLayoutBinding get() = _viewBinding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _viewBinding = FragmentLayoutBinding.inflate(inflater, container, false)
        viewBinding.tvTitleFragment.text = "Fragment leak free"
        viewBinding.root.setBackgroundResource(R.color.yellow)
        return viewBinding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _viewBinding
    }
}
