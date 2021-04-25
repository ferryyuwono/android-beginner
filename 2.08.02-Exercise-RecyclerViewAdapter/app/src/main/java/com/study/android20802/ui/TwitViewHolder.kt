package com.study.android20802.ui

import androidx.recyclerview.widget.RecyclerView
import com.study.android20802.data.TwitModel
import com.study.android20802.databinding.ItemTwitBinding

class TwitViewHolder(
    private val binding: ItemTwitBinding,
    onItemClicked: (Int) -> Unit
) : RecyclerView.ViewHolder(binding.root) {
    init {
        //TODO: Set click listener when item is clicked
        //TODO: Call onItemClicked with bindingAdapterPosition as parameter
    }

    fun bind(model: TwitModel) {
        //TODO: Set title

        //TODO: Set description

    }
}
