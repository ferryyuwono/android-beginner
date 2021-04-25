package com.study.android20901.ui

import androidx.recyclerview.widget.RecyclerView
import com.study.android20901.R
import com.study.android20901.data.InstaData
import com.study.android20901.databinding.ItemInstaBinding

class InstaViewHolder(
    private val binding: ItemInstaBinding
) : RecyclerView.ViewHolder(binding.root) {

    fun bind(model: InstaData) {
        //Set title
        binding.textViewTitle.text = model.fullName

        //Set image
        binding.imageViewThumbnail.setImageResource(getImageResourceId(model.imageId))

        //Set total view
        binding.textViewViewCount.text = "${model.totalView} Views"

        //Set description
        binding.textViewDescription.text = model.message
    }

    private fun getImageResourceId(imageId: Int): Int {
        return when (imageId) {
            0 -> R.drawable.ic_image_1
            1 -> R.drawable.ic_image_2
            2 -> R.drawable.ic_image_3
            else -> R.drawable.ic_image_4
        }
    }
}
