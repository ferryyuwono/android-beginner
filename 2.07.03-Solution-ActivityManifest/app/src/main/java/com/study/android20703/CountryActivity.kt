package com.study.android20703

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.study.android20703.databinding.ActivityCountryBinding

class CountryActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCountryBinding
    private val buttonArray = mutableListOf<Button>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCountryBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Add country button to collection
        buttonArray.apply {
            add(binding.buttonBrunai)
            add(binding.buttonCambodia)
            add(binding.buttonEastTimor)
            add(binding.buttonIndonesia)
            add(binding.buttonLaos)
            add(binding.buttonMalaysia)
            add(binding.buttonMyanmar)
            add(binding.buttonPhilippines)
            add(binding.buttonSingapore)
            add(binding.buttonThailand)
            add(binding.buttonVietnam)
        }

        //Initialize selected country
        initSelectedCountry()
    }

    private fun initSelectedCountry() {
        //Get String intent extra SELECTED_COUNTRY_EXTRA
        val selectedCountry = intent.getStringExtra(SELECTED_COUNTRY_EXTRA)

        //Validate if selectedCountry is null then return
        if (selectedCountry.isNullOrEmpty()) {
            return
        }

        //Loop to all button array
        for (button in buttonArray) {
            //Check if button tag is same as selectedCountry
            if (button.tag == selectedCountry) {
                //Change button text color to `country_selected_text_color`
                button.setTextColor(
                    ContextCompat.getColor(this, R.color.country_selected_text_color)
                )
                break
            }
        }
    }

    fun onClickButtonCountry(view: View) {
        //Cast view to button
        val button = view as Button

        //Get button tag and assign it to val selectedCountry with toString()
        val selectedCountry = button.tag.toString()

        //Create Intent() object
        val intent = Intent()

        //Put selectedCountry as SELECTED_COUNTRY_EXTRA
        intent.putExtra(SELECTED_COUNTRY_EXTRA, selectedCountry)

        //Call setResult with RESULT_OK and intent object as parameter
        //We will tell that user has choose the country and action is OK
        setResult(RESULT_OK, intent)

        //Close the activity by call finish function
        finish()
    }

    companion object {
        //Create const SELECTED_COUNTRY_EXTRA
        const val SELECTED_COUNTRY_EXTRA = "selected_country"
    }
}
