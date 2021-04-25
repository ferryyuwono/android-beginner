package com.study.android20902.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.study.android20902.data.InstaData
import com.study.android20902.databinding.ItemInstaBinding

class InstaAdapter : RecyclerView.Adapter<InstaViewHolder>() {

    private var data = mutableListOf<InstaData>()

    //Create addData(index: Int, model: InstaData) function to add model at specific index
    //Call notifyDataSetChanged() after add model to data
    fun addData(index: Int, model: InstaData) {
        data.add(index, model)
        notifyDataSetChanged()
    }

    //Create addAllData(collection: List<InstaData>) function
    //Call notifyDataSetChanged() after add model to data
    fun addAllData(collection: List<InstaData>) {
        data.addAll(collection)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, type: Int): InstaViewHolder {
        //Create view binding for item_twit
        val twitBinding = ItemInstaBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        //Create view holder and return it
        return InstaViewHolder(twitBinding)
    }

    //Set item count to data.size
    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(viewHolder: InstaViewHolder, position: Int) {
        //Call viewHolder bind function
        viewHolder.bind(data[position])
    }
}
