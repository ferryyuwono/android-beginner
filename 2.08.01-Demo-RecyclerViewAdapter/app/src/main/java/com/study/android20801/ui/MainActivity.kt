package com.study.android20801.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.study.android20801.R
import com.study.android20801.data.VideoModel
import com.study.android20801.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: VideoAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initAdapter()
        initRecyclerView()
    }

    private fun initAdapter() {
        //Video data
        val videoList = mutableListOf(
            VideoModel(
                R.drawable.ic_image_1,
                "Module 1: Introduction to Android and Kotlin",
                "Budi Arif"
            ),
            VideoModel(
                R.drawable.ic_image_2,
                "1.1: Introduction + Course Outline",
                "Anton Harum"
            ),
            VideoModel(
                R.drawable.ic_image_3,
                "Module 2: Develop Your First Android Application",
                "Budi Harum"
            ),
            VideoModel(
                R.drawable.ic_image_4,
                "2.4.3 [Solution] ImageView and ImageButton",
                "Anton Arif"
            )
        )

        //Video adapter
        adapter = VideoAdapter { model ->
            //Show toast title of the clicked video
            Toast.makeText(this, "Clicked on video `${model.title}`", Toast.LENGTH_SHORT).show()
        }

        //Add data to adapter
        adapter.addAllData(videoList)
    }

    private fun initRecyclerView() {
        //Set layout manager of recyclerview to LinearLayoutManager, orientation vertical, reverseLayout false
        binding.recyclerViewVideo.layoutManager = LinearLayoutManager(
            this,
            LinearLayoutManager.VERTICAL,
            false
        )
        binding.recyclerViewVideo.adapter = adapter
    }
}
