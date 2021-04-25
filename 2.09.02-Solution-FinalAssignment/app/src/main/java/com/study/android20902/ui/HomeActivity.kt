package com.study.android20902.ui

import android.content.SharedPreferences
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.preference.PreferenceManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.gson.Gson
import com.study.android20902.R
import com.study.android20902.data.InstaData
import com.study.android20902.databinding.ActivityHomeBinding

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

        //Get fullname using getStringExtra FULLNAME_EXTRA, and call toString()
        fullName = intent.getStringExtra(FULLNAME_EXTRA).toString()

        //Get shared preference instance
        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this)

        //Initialize adapter
        initAdapter()

        //Initialize recyclerview
        initRecyclerView()
    }

    private fun getInstaList() {
        //Get `instaListJson` String from shared preferences INSTA_LIST_KEY, set default value to ""
        val instaListJson = sharedPreferences.getString(INSTA_LIST_KEY, "")

        //Validate if the `instaListJson` is null or empty, return
        if (instaListJson.isNullOrEmpty()) {
            return
        }

        //Uncomment and import to create gson instance
        val gson = Gson()

        //Uncomment to convert `instaListJson` String to Array of InstaData using Gson
        //We passing String instaListJson, and class type we want to convert
        val instaArray = gson.fromJson(instaListJson, Array<InstaData>::class.java)

        //Add all `instaArray` to instaList
        instaList.addAll(instaArray)
    }

    private fun saveInstaList() {
        //Uncomment and import to create gson instance
        val gson = Gson()

        //Uncomment to convert `instaList` to JSON
        val instaListJson = gson.toJson(instaList)

        //Save `instaListJson` String to shared preferences using `putString`
        sharedPreferences.edit().putString(INSTA_LIST_KEY, instaListJson).apply()
    }

    private fun initAdapter() {
        //Call function getInstaList
        getInstaList()

        //Create Insta adapter
        adapter = InstaAdapter()

        //Add data to adapter
        adapter.addAllData(instaList)
    }

    private fun initRecyclerView() {
        //Set layout manager of recyclerViewInsta to LinearLayoutManager, orientation vertical, reverseLayout false
        binding.recyclerViewInsta.layoutManager = LinearLayoutManager(
            this,
            LinearLayoutManager.VERTICAL,
            false
        )

        //Set recyclerViewInsta adapter
        binding.recyclerViewInsta.adapter = adapter
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

        //Create InstaData with fullName, message
        //Random value of imageId from 0 to 3 using (0..3).random()
        //Random value of totalView from 0 to 1000 using (0..1000).random()
        val data = InstaData(
            fullName = fullName,
            imageId = (0..3).random(),
            totalView = (0..1000).random(),
            message = message
        )

        //Add data to adapter at index 0
        adapter.addData(0, data)

        //Clear the message
        binding.editTextPost.text.clear()

        //Add data to collection instaList at index 0
        instaList.add(0, data)

        //Save insta list
        saveInstaList()
    }

    companion object {
        const val FULLNAME_EXTRA = "fullName"
        private const val INSTA_LIST_KEY = "insta_list"
    }
}
