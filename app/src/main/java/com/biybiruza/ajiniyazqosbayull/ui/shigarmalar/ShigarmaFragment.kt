package com.biybiruza.ajiniyazqosbayull.ui.shigarmalar

import android.os.Bundle
import android.view.View
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.biybiruza.ajiniyazqosbayull.R
import com.biybiruza.ajiniyazqosbayull.databinding.FragmentHomeBinding

class ShigarmaFragment : Fragment(R.layout.fragment_home) {

    companion object{
        const val TYPE_ID = "type_id"
    }

    private lateinit var binding: FragmentHomeBinding
    private lateinit var navController: NavController

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentHomeBinding.bind(view)
        navController = Navigation.findNavController(view)
        binding.apply {
            card1.setOnClickListener {
                val bundle = bundleOf(TYPE_ID to 1)
                navController.navigate(R.id.action_shigarmaFragment_to_shigarmalarDizimFragment)
            }
            card2.setOnClickListener {
                val bundle = bundleOf(TYPE_ID to 2)
                navController.navigate(R.id.action_shigarmaFragment_to_shigarmalarDizimFragment)
            }
            card3.setOnClickListener {
                val bundle = bundleOf(TYPE_ID to 3)
                navController.navigate(R.id.action_shigarmaFragment_to_shigarmalarDizimFragment)
            }
            card4.setOnClickListener {
                val bundle = bundleOf(TYPE_ID to 4)
                navController.navigate(R.id.action_shigarmaFragment_to_shigarmalarDizimFragment)
            }
            card5.setOnClickListener {
                val bundle = bundleOf(TYPE_ID to 5)
                navController.navigate(R.id.action_shigarmaFragment_to_shigarmalarDizimFragment)
            }
            card6.setOnClickListener {
                val bundle = bundleOf(TYPE_ID to 6)
                navController.navigate(R.id.action_shigarmaFragment_to_shigarmalarDizimFragment)
            }
            card7.setOnClickListener {
                val bundle = bundleOf(TYPE_ID to 7)
                navController.navigate(R.id.action_shigarmaFragment_to_shigarmalarDizimFragment)
            }
        }
    }
}