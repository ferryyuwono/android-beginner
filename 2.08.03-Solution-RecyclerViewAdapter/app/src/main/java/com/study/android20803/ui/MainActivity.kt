package com.study.android20803.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.LinearLayoutManager
import com.study.android20803.R
import com.study.android20803.data.TwitModel
import com.study.android20803.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: TwitAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initAdapter()
        initRecyclerView()
    }

    private fun initAdapter() {
        //Initial twit data
        val twitList = listOf(
            TwitModel(
                "Budi Arif",
                "“The beautiful thing about learning is nobody can take it away from you.” – B.B. King"
            ),
            TwitModel(
                "Anton Harum",
                "“That is what learning is. You suddenly understand something you’ve understood all your life, but in a new way.” – Doris Lessing"
            ),
            TwitModel(
                "Budi Harum",
                "“Anyone who stops learning is old, whether at twenty or eighty. Anyone who keeps learning stays young. The greatest thing in life is to keep your mind young.” – Henry Ford"
            ),
            TwitModel(
                "Anton Arif",
                "“One hour per day of study in your chosen field is all it takes. One hour per day of study will put you at the top of your field within three years. Within five years you’ll be a national authority. In seven years, you can be one of the best people in the world at what you do.” – Earl Nightingale"
            )
        )

        //Create Twit adapter
        adapter = TwitAdapter { model ->
            //Show toast message of the clicked twit
            Toast.makeText(this, model.message, Toast.LENGTH_SHORT).show()
        }

        //Add data to adapter
        adapter.addAllData(twitList)
    }

    private fun initRecyclerView() {
        //Set layout manager of recyclerViewTwit to LinearLayoutManager, orientation vertical, reverseLayout false
        binding.recyclerViewTwit.layoutManager = LinearLayoutManager(
            this,
            LinearLayoutManager.VERTICAL,
            false
        )

        //Set recyclerViewTwit adapter
        binding.recyclerViewTwit.adapter = adapter
    }

    fun onClickButtonPost(view: View) {
        val message = binding.editTextTwit.text.toString()

        //Validate twit is empty
        if (message.isEmpty()) {
            //Show AlertDialog
            AlertDialog.Builder(this)
                .setTitle(R.string.main_twit_error_title)
                .setMessage(R.string.main_twit_empty_error)
                .setPositiveButton(R.string.main_twit_error_ok, null)
                .show()
            //Return
            return
        }

        //Create TwitModel with your fullName and message
        val model = TwitModel("Ferry Yuwono", message)

        //Add model to adapter at index 0
        adapter.addData(0, model)

        //Clear the message
        binding.editTextTwit.text.clear()
    }
}
