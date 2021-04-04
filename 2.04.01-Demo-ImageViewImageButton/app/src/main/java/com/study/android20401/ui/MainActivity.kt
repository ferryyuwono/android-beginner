package com.study.android20401.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.study.android20401.R
import com.study.android20401.data.PersonData

class MainActivity : AppCompatActivity() {
    private val personList = listOf(
        PersonData("Budi Arif", 23),
        PersonData("Budi Harum", 24),
        PersonData("Anton Arif", 25),
        PersonData("Anton Harum", 26),
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClickImageButtonSearch(view: View) {
        //FindViewById
        val editTextName = findViewById<EditText>(R.id.editTextName)
        val textViewResult = findViewById<TextView>(R.id.textViewResult)

        //Get invalid color
        val invalidColor = ContextCompat.getColor(this, R.color.main_result_invalid_text_color)

        //Validate
        val name = editTextName.text
        if (name.length < 3) {
            //Set text color
            textViewResult.setTextColor(invalidColor)

            //Set invalid message
            textViewResult.setText(R.string.main_name_invalid)
            return
        }

        //Get result
        val resultList = personList.filter { x -> x.fullName.contains(name, true) }

        //Get invalid color from colors.xml
        val validColor = ContextCompat.getColor(this, R.color.main_result_valid_text_color)

        //Set text color
        textViewResult.setTextColor(validColor)

        //Set result
        textViewResult.text = "Result: $resultList"
    }
}
