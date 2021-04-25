package com.study.android20803.ui

import androidx.recyclerview.widget.RecyclerView
import com.study.android20803.data.TwitModel
import com.study.android20803.databinding.ItemTwitBinding

class TwitViewHolder(
    private val binding: ItemTwitBinding,
    onItemClicked: (Int) -> Unit
) : RecyclerView.ViewHolder(binding.root) {
    init {
        //Set click listener when item is clicked
        itemView.setOnClickListener {
            //Call onItemClicked with bindingAdapterPosition as parameter
            onItemClicked(bindingAdapterPosition)
        }
    }

    fun bind(model: TwitModel) {
        //Set title
        binding.textViewTitle.text = model.fullName

        //Set description
        binding.textViewDescription.text = model.message
    }
}
