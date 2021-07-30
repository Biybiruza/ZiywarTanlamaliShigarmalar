package com.biybiruza.ajiniyazqosbayull.ui.shigarmalar

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.biybiruza.ajiniyazqosbayull.R
import com.biybiruza.ajiniyazqosbayull.data.model.Ziywar
import com.biybiruza.ajiniyazqosbayull.databinding.ItemBinding

class ListAdapter : RecyclerView.Adapter<ListAdapter.ListViewHolder>() {

    private lateinit var binding: ItemBinding

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun populateModel(model: Ziywar){
            binding = ItemBinding.bind(itemView)
            binding.shigarmaName.text = model.name
            itemView.setOnClickListener{
                onItemClick.invoke(model.id)
            }
        }
    }

    var models = listOf<Ziywar>()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    private var onItemClick:(id: Int) -> Unit ={}
    fun setOnItemClick(onItemClick:(id: Int) -> Unit){
        this.onItemClick = onItemClick
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item,parent,false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int = models.size

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        holder.populateModel(models[position])
    }
}