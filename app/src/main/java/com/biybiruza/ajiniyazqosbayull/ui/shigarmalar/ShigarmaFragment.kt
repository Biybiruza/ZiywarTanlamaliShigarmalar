package com.biybiruza.ajiniyazqosbayull.ui.shigarmalar

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.biybiruza.ajiniyazqosbayull.R
import com.biybiruza.ajiniyazqosbayull.databinding.FragmentHomeBinding

class ShigarmaFragment : Fragment(R.layout.fragment_home) {

    lateinit var binding: FragmentHomeBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentHomeBinding.bind(view)

        binding.apply {
            card1.setOnClickListener {

            }
            card2.setOnClickListener {

            }
            card3.setOnClickListener {

            }
            card4.setOnClickListener {

            }
            card5.setOnClickListener {

            }
            card6.setOnClickListener {

            }
            card7.setOnClickListener {

            }
        }
    }
}