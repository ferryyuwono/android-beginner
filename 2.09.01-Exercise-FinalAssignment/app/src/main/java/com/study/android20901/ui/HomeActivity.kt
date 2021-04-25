package com.study.android20901.ui

import android.content.SharedPreferences
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.preference.PreferenceManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.gson.Gson
import com.study.android20901.R
import com.study.android20901.data.InstaData
import com.study.android20901.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding
    private lateinit var fullName: String
    private lateinit var adapter: InstaAdapter
    private lateinit var sharedPreferences: SharedPreferences
    private val instaList = mutableListOf<InstaData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //TODO: Get fullname using getStringExtra FULLNAME_EXTRA, and call toString()


        //TODO: Get shared preference instance


        //Initialize adapter
        initAdapter()

        //Initialize recyclerview
        initRecyclerView()
    }

    private fun getInstaList() {
        //TODO: Get `instaListJson` String from shared preferences INSTA_LIST_KEY, set default value to ""


        //TODO: Validate if the `instaListJson` is null or empty, return


        //TODO: Uncomment and import to create gson instance
        //val gson = Gson()

        //TODO: Uncomment to convert `instaListJson` String to Array of InstaData using Gson
        //We passing String instaListJson, and class type we want to convert
        //val instaArray = gson.fromJson(instaListJson, Array<InstaData>::class.java)

        //TODO: Add all `instaArray` to instaList

    }

    private fun saveInstaList() {
        //TODO: Uncomment and import to create gson instance
        //val gson = Gson()

        //TODO: Uncomment to convert `instaList` to JSON
       // val instaListJson = gson.toJson(instaList)

        //TODO: Save `instaListJson` String to shared preferences using `putString`

    }

    private fun initAdapter() {
        //Call function getInstaList
        getInstaList()

        //TODO: Create Insta adapter


        //TODO: Add data to adapter

    }

    private fun initRecyclerView() {
        //TODO: Set layout manager of recyclerViewInsta to LinearLayoutManager, orientation vertical, reverseLayout false


        //TODO: Set recyclerViewInsta adapter

    }

    fun onClickButtonLogout(view: View) {
        //Finish activity
        finish()
    }

    fun onClickButtonPost(view: View) {
        val message = binding.editTextPost.text.toString()

        //Validate if message is empty
        if (message.isEmpty()) {
            //Show AlertDialog
            AlertDialog.Builder(this)
                .setTitle(R.string.app_title)
                .setMessage(R.string.home_input_invalid)
                .setPositiveButton(R.string.home_input_invalid, null)
                .show()

            return
        }

        //TODO: Create InstaData with fullName, message
        //TODO: Random value of imageId from 0 to 3 using (0..3).random()
        //TODO: Random value of totalView from 0 to 1000 using (0..1000).random()


        //TODO: Add data to adapter at index 0


        //Clear the message
        binding.editTextPost.text.clear()

        //TODO: Add data to collection instaList at index 0


        //Save insta list
        saveInstaList()
    }

    companion object {
        const val FULLNAME_EXTRA = "fullName"
        private const val INSTA_LIST_KEY = "insta_list"
    }
}
