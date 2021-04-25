package com.study.android20902.ui

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.google.gson.Gson
import com.study.android20902.R
import com.study.android20902.data.UserData
import com.study.android20902.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding
    private lateinit var sharedPreferences: SharedPreferences
    private val userList = mutableListOf<UserData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Get shared preference instance
        sharedPreferences = getPreferences(Context.MODE_PRIVATE)

        //Call function getUserList
        getUserList()
    }

    private fun getUserList() {
        //Get `userListJson` String from shared preferences, set default value to ""
        val userListJson = sharedPreferences.getString(USER_LIST_KEY, "")

        //Validate if the `userListJson` is null or empty, return
        if (userListJson.isNullOrEmpty()) {
            return
        }

        //Uncomment and import to create gson instance
        val gson = Gson()

        //Uncomment to convert `userListJson` String to Array of UserData using Gson
        //We passing String userListJson, and class type we want to convert
        val userArray = gson.fromJson(userListJson, Array<UserData>::class.java)

        //Add all `userArray` to userList
        userList.addAll(userArray)
    }

    fun onClickButtonLogin(view: View) {
        val username = binding.editTextUsername.text.toString()
        val password = binding.editTextPassword.text.toString()

        //Validate if either username or password is empty
        if (username.isEmpty() || password.isEmpty()) {
            //Show error message all parameter must be filled
            binding.textViewError.setText(R.string.login_input_invalid)

            //Set error visibility to visible
            binding.textViewError.visibility = View.VISIBLE
            return
        }

        //Find user from userList (username ignoreCase true and password is equals)
        val existingUser = userList.find { x ->
            x.username.equals(username, true) && x.passwordMd5 == password.toMd5()
        }

        //Validate if user is not found (null)
        if (existingUser == null) {
            //Show error message username or password is wrong
            binding.textViewError.setText(R.string.login_user_or_password_wrong)

            //Set error visibility to visible
            binding.textViewError.visibility = View.VISIBLE
            return
        }

        //All parameter is filled
        binding.textViewError.visibility = View.GONE

        //Create Intent Home Activity
        val intent = Intent(this, HomeActivity::class.java)

        //Set extra HomeActivity.FULLNAME_EXTRA with fullName
        intent.putExtra(
            HomeActivity.FULLNAME_EXTRA,
            "${existingUser.firstName} ${existingUser.lastName}"
        )

        //Start Activity with Intent
        startActivity(intent)
    }

    companion object {
        private const val USER_LIST_KEY = "user_list"
    }
}
