package com.study.android20701

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.study.android20701.databinding.ActivityStatusBinding

class StatusActivity : AppCompatActivity() {

    private lateinit var binding: ActivityStatusBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStatusBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Get intent extra
        val parcelId = intent.getIntExtra(PARCEL_ID_EXTRA, 0)

        //Set id text
        binding.textViewId.text = parcelId.toString()

        //Set status text and color
        when (parcelId) {
            in 1..33 -> {
                binding.textViewStatus.setText(R.string.status_in_process)
                binding.textViewStatus.setTextColor(
                    ContextCompat.getColor(this, R.color.status_in_process_text_color)
                )
            }
            in 34..66 -> {
                binding.textViewStatus.setText(R.string.status_delivery)
                binding.textViewStatus.setTextColor(
                    ContextCompat.getColor(this, R.color.status_delivery_text_color)
                )
            }
            else -> {
                binding.textViewStatus.setText(R.string.status_arrived)
                binding.textViewStatus.setTextColor(
                    ContextCompat.getColor(this, R.color.status_arrived_text_color)
                )
            }
        }
    }

    companion object {
        const val PARCEL_ID_EXTRA = "parcel_id"
    }
}
