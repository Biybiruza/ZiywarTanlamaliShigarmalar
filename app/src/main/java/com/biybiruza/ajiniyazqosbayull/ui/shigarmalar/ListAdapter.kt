package com.biybiruza.ajiniyazqosbayull.ui.shigarmalar

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.biybiruza.ajiniyazqosbayull.databinding.ItemBinding

class ListAdapter : RecyclerView.Adapter<ListAdapter.ListViewHolder>() {

    private lateinit var binding: ItemBinding

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun populateModel(){
            binding = ItemBinding.bind(itemView)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        TODO("Not yet implemented")
    }
}