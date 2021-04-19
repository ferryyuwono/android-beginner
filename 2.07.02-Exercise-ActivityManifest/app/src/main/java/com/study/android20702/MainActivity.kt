package com.study.android20702

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.study.android20702.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun onClickButtonCountry(view: View) {
        //Get selected country text
        val selectedCountry = binding.textViewSelectedCountry.text.toString()

        //TODO: Create intent to country activity

        //TODO: Put selected country in intent extra

        //TODO: Go to status activity using startActivityForResult with requestCode ACTION_CHOOSE_COUNTRY

    }

    //This function will be called when we go back from startActivityForResult
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        //Check the requestCode is ACTION_CHOOSE_COUNTRY
        if (requestCode == ACTION_CHOOSE_COUNTRY) {
            //Validate if the resultCode is not RESULT_OK then return
            if (resultCode != RESULT_OK) {
                return
            }

            //Validate if data is null then return
            if (data == null) {
                return
            }

            //TODO: Get SELECTED_COUNTRY_EXTRA from `data` Intent using getStringExtra()
            //val selectedCountry =

            //TODO: Set selectedCountry to textViewSelectedCountry

        }
    }

    companion object {
        private const val ACTION_CHOOSE_COUNTRY = 100
    }
}
