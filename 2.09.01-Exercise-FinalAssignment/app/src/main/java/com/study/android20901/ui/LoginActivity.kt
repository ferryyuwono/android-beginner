package com.study.android20901.ui

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.preference.PreferenceManager
import com.google.gson.Gson
import com.study.android20901.R
import com.study.android20901.data.UserData
import com.study.android20901.databinding.ActivityLoginBinding
import com.study.android20901.extension.toMd5

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding
    private lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //TODO: Get shared preference instance

    }

    private fun findUser(username: String, passwordMd5: String): UserData? {
        //TODO: Get `userListJson` String from shared preferences USER_LIST_KEY, set default value to ""

        //TODO: Validate if the `userListJson` is null or empty, return


        //TODO: Uncomment and import to create gson instance
        //val gson = Gson()

        //TODO: Uncomment to convert `userListJson` String to Array of UserData using Gson
        //We passing String userListJson, and class type we want to convert
        //val userArray = gson.fromJson(userListJson, Array<UserData>::class.java)

        //TODO: Find and return user from userArray using `find` (username ignoreCase true and password is equals)
        return null
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

        //Find user by calling findUser() function
        val existingUser = findUser(username, password.toMd5())

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

        //Clear username text
        binding.editTextUsername.text.clear()

        //Clear password text
        binding.editTextPassword.text.clear()

        //TODO: Create Intent Home Activity


        //TODO: Set extra HomeActivity.FULLNAME_EXTRA with fullName


        //TODO: Start activity with intent home

    }

    fun onClickButtonSignUp(view: View) {
        //TODO: Create Intent Sign Up Activity


        //TODO: Start activity with intent sign up

    }

    companion object {
        private const val USER_LIST_KEY = "user_list"
    }
}
