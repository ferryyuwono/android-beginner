package com.study.android20703

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.study.android20703.databinding.ActivityMainBinding

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

        //Create intent to country activity
        val intent = Intent(this, CountryActivity::class.java)

        //Put selected country in intent extra
        intent.putExtra(CountryActivity.SELECTED_COUNTRY_EXTRA, selectedCountry)

        //Go to status activity using startActivityForResult with requestCode ACTION_CHOOSE_COUNTRY
        startActivityForResult(intent, ACTION_CHOOSE_COUNTRY)
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

            //Get SELECTED_COUNTRY_EXTRA from `data` Intent using getStringExtra()
            val selectedCountry = data.getStringExtra(CountryActivity.SELECTED_COUNTRY_EXTRA)

            //Set selectedCountry to textViewSelectedCountry
            binding.textViewSelectedCountry.text = selectedCountry
        }
    }

    companion object {
        private const val ACTION_CHOOSE_COUNTRY = 100
    }
}
