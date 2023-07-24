package com.github.kiolk.viewbindingpresentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class FindViewByIdFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val root: View = inflater.inflate(R.layout.fragment_layout, container, false)
        root.findViewById<TextView>(R.id.tv_title_fragment).text = "Fragment with findViewById"
        root.setBackgroundResource(R.color.blue)
        return root
    }
}
