package com.study.android20802.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.study.android20802.data.TwitModel
import com.study.android20802.databinding.ItemTwitBinding

class TwitAdapter(
    private val onItemClicked: (TwitModel) -> Unit
) : RecyclerView.Adapter<TwitViewHolder>() {

    private var data = mutableListOf<TwitModel>()

    //TODO: Create addData(index: Int, model: TwitModel) function to add model at specific index
    //TODO: Call notifyDataSetChanged() after add model to data

    //TODO: Create addAllData(collection: List<TwitModel>) function
    //TODO: Call notifyDataSetChanged() after add model to data


    override fun onCreateViewHolder(parent: ViewGroup, type: Int): TwitViewHolder {
        //Create view binding for item_twit
        val twitBinding = ItemTwitBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        //Create view holder and return it
        return TwitViewHolder(twitBinding) { position ->
            //Call onItemClicked when item inside view holder is clicked
            onItemClicked(data[position])
        }
    }

    //Set item count to data.size
    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(viewHolder: TwitViewHolder, position: Int) {
        //TODO: Call viewHolder bind function

    }
}
