package com.study.android20901.ui

import android.content.SharedPreferences
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.preference.PreferenceManager
import com.google.gson.Gson
import com.study.android20901.R
import com.study.android20901.data.UserData
import com.study.android20901.databinding.ActivitySignUpBinding
import com.study.android20901.extension.toMd5

class SignUpActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySignUpBinding
    private lateinit var sharedPreferences: SharedPreferences
    private val userList = mutableListOf<UserData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //TODO: Get shared preference instance


        //Call function getUserList
        getUserList()
    }

    private fun getUserList() {
        //TODO: Get `userListJson` String from shared preferences USER_LIST_KEY, set default value to ""

        //TODO: Validate if the `userListJson` is null or empty, return


        //TODO: Uncomment and import to create gson instance
        //val gson = Gson()

        //TODO: Uncomment to convert `userListJson` String to Array of UserData using Gson
        //We passing String userListJson, and class type we want to convert
        //val userArray = gson.fromJson(userListJson, Array<UserData>::class.java)

        //TODO: Add all `userArray` to userList

    }

    private fun saveUserList() {
        //TODO: Uncomment and import to create gson instance
        //val gson = Gson()

        //TODO: Uncomment to convert `userList` to JSON
        //val userListJson = gson.toJson(userList)

        //TODO: Save `userListJson` String to shared preferences using `putString`

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

        //TODO: Find user from userList (username ignoreCase true)


        //TODO: Validate if user is exists (not null)
        //TODO: Show error message username already exists
        //TODO: Set error visibility to visible


        //All parameter is filled
        binding.textViewError.visibility = View.GONE

        //TODO: Create UserData
        //TODO: Save password in md5 format by call password.toMd5()

        //TODO: Add user to collection

        //TODO: Save user list

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
