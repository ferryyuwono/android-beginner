package com.study.android20602.ui

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.study.android20602.R
import com.study.android20602.data.UserData
import com.study.android20602.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val userList = mutableListOf<UserData>()
    private lateinit var binding: ActivityMainBinding

    //TODO: Create SharedPreferences variable
    private lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //TODO: Get shared preference instance
        sharedPreferences = getPreferences(Context.MODE_PRIVATE)

        //Call function getUserList
        getUserList()
    }

    private fun getUserList() {
        //TODO: Get `userListJson` String from shared preferences, set default value to ""

        //TODO: Validate if the `userListJson` is null or empty, return

        //TODO: Uncomment and import to create gson instance
        //val gson = Gson()

        //TODO: Uncomment to convert `userListJson` String to Array of UserData using Gson
        //We passing String userListJson, and class type we want to convert
        //val userArray = gson.fromJson(userListJson, Array<UserData>::class.java)

        //TODO: Add all `userArray` to userList

        //Call function showAllUserList
        showAllUserList()
    }

    private fun saveUserList() {
        //TODO: Uncomment and import to create Create gson instance
        //val gson = Gson()

        //TODO: Uncomment to convert `userList` to JSON
        //val userListJson = gson.toJson(userList)

        //TODO: Save `userListJson` String to shared preferences using `putString`

    }

    private fun showAllUserList() {
        //Show user list in textViewData
        binding.textViewData.text = userList.joinToString("\n")
    }

    fun onClickButtonRegister(view: View) {
        //Get username, password, and confirm password and convert it toString()
        val username = binding.editTextUsername.text.toString()
        val password = binding.editTextPassword.text.toString()
        val confirmPassword = binding.editTextConfirmPassword.text.toString()

        //Validate if either username, password, or confirm password is empty
        if (username.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
            //Set error message
            binding.textViewError.setText(R.string.main_all_parameter_must_be_filled)

            //Show error message
            binding.textViewError.visibility = View.VISIBLE
            return
        }
        //Validate if password and confirm password does not match
        else if (password != confirmPassword) {
            //Set error message
            binding.textViewError.setText(R.string.main_password_confirmation_does_not_match)

            //Show error message
            binding.textViewError.visibility = View.VISIBLE
            return
        }

        //All parameter is filled
        binding.textViewError.visibility = View.GONE

        //Create UserData
        val user = UserData(username, password)

        //Add to collection
        userList.add(user)

        //Call function saveUserList
        saveUserList()

        //Call function showAllUserList
        showAllUserList()

        //Clear value
        binding.editTextUsername.text.clear()
        binding.editTextPassword.text.clear()
        binding.editTextConfirmPassword.text.clear()
    }

    companion object {
        private const val USER_LIST_KEY = "userList"
    }
}
