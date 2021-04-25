package com.study.android20601.ui

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.preference.PreferenceManager
import com.study.android20601.data.PersonData
import com.study.android20601.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val personList = mutableListOf<PersonData>()
    private lateinit var binding: ActivityMainBinding
    private lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Get shared preference instance
        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this)
        setMajorPersistentValue()
    }

    private fun setMajorPersistentValue() {
        //Get major value from shared preferences
        val major = sharedPreferences.getString(MAJOR_KEY, "")

        //Set major value to edit text
        binding.editTextMajor.setText(major.toString())
    }

    private fun saveMajorPersistentValue() {
        //Get major value from edit text
        val major = binding.editTextMajor.text

        //Save major value to shared prefences
        sharedPreferences.edit().putString(MAJOR_KEY, major.toString()).apply()
    }

    fun onClickButtonAdd(view: View) {
        val major = binding.editTextMajor.text
        val fullName = binding.editTextFullName.text

        //Validate if either major or full name is empty
        if (major.isEmpty() || fullName.isEmpty()) {
            //Show error message
            binding.textViewError.visibility = View.VISIBLE
            return
        }

        //All parameter is filled
        binding.textViewError.visibility = View.GONE

        //Save major value
        saveMajorPersistentValue()

        //Create PersonData
        val person = PersonData(major.toString(), fullName.toString())

        //Add to collection
        personList.add(person)

        //Print list
        binding.textViewData.text = personList.joinToString("\n")
    }

    companion object {
        private const val MAJOR_KEY = "major"
    }
}
