package com.study.android20701

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.study.android20701.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun onClickButtonCheck(view: View) {
        val parcelIdText = binding.editTextId.text.toString()

        //Validate if parcel id is empty
        if (parcelIdText.isEmpty()) {
            //Empty error
            binding.textViewError.setText(R.string.main_parcel_id_empty_error)

            //Show error message
            binding.textViewError.visibility = View.VISIBLE
            return
        }

        //Validate if parcel id is between 1..100
        val parcelId = parcelIdText.toInt()
        if (parcelId < 1 || parcelId > 100) {
            //Empty error
            binding.textViewError.setText(R.string.main_parcel_id_range_error)

            //Show error message
            binding.textViewError.visibility = View.VISIBLE
            return
        }

        //All parameter is valid
        binding.textViewError.visibility = View.GONE

        //Create intent to status activity
        val intent = Intent(this, StatusActivity::class.java)

        //Put parcel id in intent extra
        intent.putExtra(StatusActivity.PARCEL_ID_EXTRA, parcelId)

        //Go to status activity
        startActivity(intent)
    }
}
