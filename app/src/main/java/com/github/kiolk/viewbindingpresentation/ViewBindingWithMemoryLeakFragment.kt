package com.github.kiolk.viewbindingpresentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.github.kiolk.viewbindingpresentation.databinding.FragmentLayoutBinding

class ViewBindingWithMemoryLeakFragment : Fragment() {

    private lateinit var viewBinding: FragmentLayoutBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        viewBinding = FragmentLayoutBinding.inflate(inflater, container, false)
        viewBinding.tvTitleFragment.text = "Fragment that produce memory leak"
        viewBinding.root.setBackgroundResource(R.color.red)
        return viewBinding.root
    }
}
