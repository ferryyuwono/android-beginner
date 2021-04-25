package com.study.android20801.ui

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.study.android20801.data.VideoModel
import com.study.android20801.databinding.ItemVideoBinding

class VideoViewHolder(
    private val binding: ItemVideoBinding,
    onItemClicked: (Int) -> Unit
) : RecyclerView.ViewHolder(binding.root) {
    init {
        //Set click listener when item is clicked
        itemView.setOnClickListener {
            //Call onItemClicked with bindingAdapterPosition as parameter
            onItemClicked(bindingAdapterPosition)
        }
    }

    fun bind(model: VideoModel) {
        //Set image thumbnail
        binding.imageViewThumbnail.setImageResource(model.imageResourceId)

        //Set title
        binding.textViewTitle.text = model.title

        //Set description
        binding.textViewDescription.text = model.fullName
    }
}
