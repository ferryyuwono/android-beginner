package com.study.android20501.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.study.android20501.R
import com.study.android20501.data.PersonData
import com.study.android20501.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val personList = mutableListOf<PersonData>()
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun onClickButtonSubmit(view: View) {
        //No need to use findViewById
        //val firstName = findViewById<EditText>(R.id.editTextFirstName).text
        //val lastName = findViewById<EditText>(R.id.editTextLastName).text
        //val age = findViewById<EditText>(R.id.editTextAge).text
        val firstName = binding.editTextFirstName.text
        val lastName = binding.editTextLastName.text
        val age = binding.editTextAge.text

        //Validate if either first name, last name, or age `text.isEmpty()` then
        if (firstName.isEmpty() || lastName.isEmpty() || age.isEmpty()) {
            binding.textViewError.visibility = View.VISIBLE
            return
        }

        //All parameter is filled
        binding.textViewError.visibility = View.GONE

        //Create PersonData
        val person = PersonData(firstName.toString(), lastName.toString(), age.toString().toInt())

        //Add to collection
        personList.add(person)

        //Print list
        binding.textViewResult.text = personList.joinToString("\n")
    }
}
