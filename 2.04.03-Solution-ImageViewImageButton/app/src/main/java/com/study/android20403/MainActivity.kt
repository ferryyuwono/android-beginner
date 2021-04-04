package com.study.android20403

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    //Create onClickCheckBoxBudiFavorite function
    fun onClickCheckBoxBudiFavorite(view: View) {
        //FindViewById for checkBoxBudiFavorite, textViewBudiFavorite
        val checkBoxBudiFavorite = findViewById<CheckBox>(R.id.checkBoxBudiFavorite)
        val textViewBudiFavorite = findViewById<TextView>(R.id.textViewBudiFavorite)

        //Using if condition, set textViewBudiFavorite.visibility to View.VISIBLE when checkBoxBudiFavorite is checked
        //Else set textViewBudiFavorite.visibility to View.GONE
        if (checkBoxBudiFavorite.isChecked) {
            textViewBudiFavorite.visibility = View.VISIBLE
        }
        else {
            textViewBudiFavorite.visibility = View.GONE
        }
    }

    //Repeat for onClickCheckBoxAntonFavorite function
    fun onClickCheckBoxAntonFavorite(view: View) {
        val checkBoxAntonFavorite = findViewById<CheckBox>(R.id.checkBoxAntonFavorite)
        val textViewAntonFavorite = findViewById<TextView>(R.id.textViewAntonFavorite)

        if (checkBoxAntonFavorite.isChecked) {
            textViewAntonFavorite.visibility = View.VISIBLE
        }
        else {
            textViewAntonFavorite.visibility = View.GONE
        }
    }
}
