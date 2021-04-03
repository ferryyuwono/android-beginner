package com.study.android20302

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClickButtonSubmit(view: View) {
        //TODO: findViewById for first name, last name, age, and textViewWelcome

        //TODO: Validate if either first name, last name, or age `text.isEmpty()` then
        //TODO: Call textViewWelcome.setText() function with R.string.main_input_invalid as parameter
        //TODO: Get invalid color using ContextCompat.getColor(this, R.color.main_welcome_invalid_text_color)
        //TODO: Call textViewWelcome.setTextColor() function with invalid color as parameter
        //TODO: Use `return` to exit the function


        //TODO: Set textViewWelcome text with "Welcome, [first name] [last name]. You are [age] years old."
        //TODO: Get valid color using ContextCompat.getColor(this, R.color.main_welcome_valid_text_color)
        //TODO: Call textViewWelcome.setTextColor() function with valid color as parameter
    }
}
