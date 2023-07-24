package com.github.kiolk.viewbindingpresentation

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import by.kirich1409.viewbindingdelegate.viewBinding
import com.github.kiolk.viewbindingpresentation.databinding.FragmentLayoutBinding

class ViewBindingWithDelegateFragment : Fragment(R.layout.fragment_layout) {

    private val viewBinding: FragmentLayoutBinding by viewBinding(FragmentLayoutBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewBinding.tvTitleFragment.text = "Fragment leak free by using delegate"
        viewBinding.root.setBackgroundResource(R.color.green)
    }
}
