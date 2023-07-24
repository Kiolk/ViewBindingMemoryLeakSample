package com.github.kiolk.viewbindingpresentation

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.github.kiolk.viewbindingpresentation.databinding.ActivityMainBinding

@SuppressLint("SetTextI18n")
class MainActivity : AppCompatActivity() {

    private lateinit var viewBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        val adapter = FragmentAdapter(supportFragmentManager)
        viewBinding.vpContainer.adapter = adapter
    }

    class FragmentAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

        private val fragments: List<Fragment>

        init {
            fragments = listOf(
                FindViewByIdFragment(),
                FindViewByIdFragment(),
                ViewBindingWithMemoryLeakFragment(),
                ViewBindingWithMemoryLeakFragment(),
                ViewBindingFragment(),
                ViewBindingWithDelegateFragment(),
                FindViewByIdFragment(),
                FindViewByIdFragment(),
                ViewBindingWithMemoryLeakFragment(),
                ViewBindingWithMemoryLeakFragment(),
                ViewBindingFragment(),
                ViewBindingWithDelegateFragment(),
            )
        }

        override fun getCount(): Int {
            return fragments.size;
        }

        override fun getItem(position: Int): Fragment {
            return fragments[position]
        }

    }
}
