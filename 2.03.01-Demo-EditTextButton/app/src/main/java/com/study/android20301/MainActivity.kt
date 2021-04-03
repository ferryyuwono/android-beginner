package com.study.android20301

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

    //Function that's called when submit button clicked
    fun onClickButtonSubmit(view: View) {
        val editTextName = findViewById<EditText>(R.id.editTextName)
        val textViewWelcome = findViewById<TextView>(R.id.textViewWelcome)

        textViewWelcome.text = "Welcome ${editTextName.text}"
    }
}
