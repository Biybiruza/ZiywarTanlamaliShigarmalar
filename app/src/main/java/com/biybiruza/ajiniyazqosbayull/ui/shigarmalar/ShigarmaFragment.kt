package com.biybiruza.ajiniyazqosbayull.ui.shigarmalar

import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.biybiruza.ajiniyazqosbayull.R
import com.biybiruza.ajiniyazqosbayull.databinding.FragmentHomeBinding

class ShigarmaFragment : Fragment(R.layout.fragment_home) {

    private lateinit var binding: FragmentHomeBinding
    private lateinit var navController: NavController

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentHomeBinding.bind(view)
        navController = Navigation.findNavController(view)

        binding.apply {
            card1.setOnClickListener {
                navController.navigate(R.id.action_shigarmaFragment_to_shigarmalarDizimFragment)
            }
            card2.setOnClickListener {
                navController.navigate(R.id.action_shigarmaFragment_to_shigarmalarDizimFragment)
            }
            card3.setOnClickListener {
                navController.navigate(R.id.action_shigarmaFragment_to_shigarmalarDizimFragment)
            }
            card4.setOnClickListener {
                navController.navigate(R.id.action_shigarmaFragment_to_shigarmalarDizimFragment)
            }
            card5.setOnClickListener {
                navController.navigate(R.id.action_shigarmaFragment_to_shigarmalarDizimFragment)
            }
            card6.setOnClickListener {
                navController.navigate(R.id.action_shigarmaFragment_to_shigarmalarDizimFragment)
            }
            card7.setOnClickListener {
                navController.navigate(R.id.action_shigarmaFragment_to_shigarmalarDizimFragment)
            }
        }
    }
}