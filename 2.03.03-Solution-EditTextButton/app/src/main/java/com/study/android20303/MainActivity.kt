package com.study.android20303

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClickButtonSubmit(view: View) {
        //findViewById for first name, last name, age, and textViewWelcome
        val editTextFirstName = findViewById<EditText>(R.id.editTextFirstName)
        val editTextLastName = findViewById<EditText>(R.id.editTextLastName)
        val editTextAge = findViewById<EditText>(R.id.editTextAge)
        val textViewWelcome = findViewById<TextView>(R.id.textViewWelcome)

        //Validate if either first name, last name, or age `text.isEmpty()` then
        if (editTextFirstName.text.isEmpty() ||
            editTextLastName.text.isEmpty() ||
            editTextAge.text.isEmpty()
        ) {
            //Call textViewWelcome.setText() function with R.string.main_input_invalid as parameter
            textViewWelcome.setText(R.string.main_input_invalid)

            //Get invalid color using ContextCompat.getColor(this, R.color.main_welcome_invalid_text_color)
            val invalidColor = ContextCompat.getColor(this, R.color.main_welcome_invalid_text_color)

            //Call textViewWelcome.setTextColor() function with invalid color as parameter
            textViewWelcome.setTextColor(invalidColor)

            //Use `return` to exit the onClickButtonSubmit function
            return
        }

        //Set textViewWelcome text with "Welcome, [first name] [last name]. You are [age] years old."
        textViewWelcome.text = "Welcome ${editTextFirstName.text} ${editTextLastName.text}. You are ${editTextAge.text} years old."

        //Get valid color using ContextCompat.getColor(this, R.color.main_welcome_valid_text_color)
        val validColor = ContextCompat.getColor(this, R.color.main_welcome_valid_text_color)

        //Call textViewWelcome.setTextColor() function with valid color as parameter
        textViewWelcome.setTextColor(validColor)
    }
}
