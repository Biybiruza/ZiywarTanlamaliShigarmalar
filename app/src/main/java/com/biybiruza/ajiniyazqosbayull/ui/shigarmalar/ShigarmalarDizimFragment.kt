package com.biybiruza.ajiniyazqosbayull.ui.shigarmalar

import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toolbar
import androidx.annotation.RequiresApi
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.DividerItemDecoration
import com.biybiruza.ajiniyazqosbayull.MainActivity
import com.biybiruza.ajiniyazqosbayull.R
import com.biybiruza.ajiniyazqosbayull.data.dao.ZiywarDao
import com.biybiruza.ajiniyazqosbayull.databinding.FragmentShigarmalarDizimBinding
import java.util.function.ToLongBiFunction

@Suppress("UNREACHABLE_CODE")
class ShigarmalarDizimFragment : Fragment(R.layout.fragment_shigarmalar_dizim) {

    private lateinit var binding: FragmentShigarmalarDizimBinding
    private lateinit var dao: ZiywarDao
    private val adapter = ListAdapter()

    @RequiresApi(Build.VERSION_CODES.Q)
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentShigarmalarDizimBinding.bind(view)
//        val toolbar = view.findViewById<Toolbar>(R.id.toolbar)
        (activity as MainActivity?)?.toolbar?.setNavigationIcon(R.drawable.ic_backspace)
        (activity as MainActivity?)?.toolbar?.setNavigationOnClickListener {
            (activity as MainActivity?)?.onBackPressed()
        }
        binding.recyclerView.addItemDecoration(DividerItemDecoration(requireContext(),DividerItemDecoration.VERTICAL))

    }

}