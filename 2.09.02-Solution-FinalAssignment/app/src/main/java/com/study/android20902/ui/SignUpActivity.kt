package com.study.android20902.ui

import android.content.SharedPreferences
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.preference.PreferenceManager
import com.google.gson.Gson
import com.study.android20902.R
import com.study.android20902.data.UserData
import com.study.android20902.databinding.ActivitySignUpBinding
import com.study.android20902.extension.toMd5

class SignUpActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySignUpBinding
    private lateinit var sharedPreferences: SharedPreferences
    private val userList = mutableListOf<UserData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Get shared preference instance
        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this)

        //Call function getUserList
        getUserList()
    }

    private fun getUserList() {
        //Get `userListJson` String from shared preferences USER_LIST_KEY, set default value to ""
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

    private fun saveUserList() {
        //Uncomment and import to create gson instance
        val gson = Gson()

        //Uncomment to convert `userList` to JSON
        val userListJson = gson.toJson(userList)

        //Save `userListJson` String to shared preferences using `putString`
        sharedPreferences.edit().putString(USER_LIST_KEY, userListJson).apply()
    }

    fun onClickButtonSignUp(view: View) {
        val firstName = binding.editTextFirstName.text.toString()
        val lastName = binding.editTextLastName.text.toString()
        val username = binding.editTextUsername.text.toString()
        val password = binding.editTextPassword.text.toString()

        //Validate if either parameter is empty
        if (firstName.isEmpty() || lastName.isEmpty() || username.isEmpty() || password.isEmpty()) {
            //Show error message all parameter must be filled
            binding.textViewError.setText(R.string.sign_up_input_invalid)

            //Set error visibility to visible
            binding.textViewError.visibility = View.VISIBLE
            return
        }

        //Find user from userList (username ignoreCase true)
        val existingUser = userList.find { x -> x.username.equals(username, true) }

        //Validate if user is exists (not null)
        if (existingUser != null) {
            //Show error message username already exists
            binding.textViewError.setText(R.string.sign_up_user_exists)

            //Set error visibility to visible
            binding.textViewError.visibility = View.VISIBLE
            return
        }

        //All parameter is filled
        binding.textViewError.visibility = View.GONE

        //Create UserData
        val user = UserData(
            firstName = firstName,
            lastName = lastName,
            username = username,
            passwordMd5 = password.toMd5() //Save password in md5 format
        )

        //Add user to collection
        userList.add(user)

        //Save user list
        saveUserList()

        //Show AlertDialog success
        AlertDialog.Builder(this)
            .setTitle(R.string.sign_up_title)
            .setMessage(R.string.sign_up_success)
            .setCancelable(false)
            .setPositiveButton(R.string.sign_up_ok) { _, _ ->
                //Finish the activity
                finish()
            }.show()
    }

    companion object {
        private const val USER_LIST_KEY = "user_list"
    }
}
