package com.study.android20801.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.study.android20801.data.VideoModel
import com.study.android20801.databinding.ItemVideoBinding

class VideoAdapter(
    private val onItemClicked: (VideoModel) -> Unit
) : RecyclerView.Adapter<VideoViewHolder>() {

    var data = mutableListOf<VideoModel>()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, type: Int): VideoViewHolder {
        //Create view binding for item_video
        val videoBinding = ItemVideoBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        //Create view holder
        return VideoViewHolder(videoBinding) { position ->
            //Call onItemClicked when item inside view holder is clicked
            onItemClicked(data[position])
        }
    }

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(viewHolder: VideoViewHolder, position: Int) {
        viewHolder.bind(data[position])
    }
}
