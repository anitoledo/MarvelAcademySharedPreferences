package com.example.marvelacademysharedpreferences

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_tutorial.*

class TutorialActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tutorial)

        // Get your SharedPreferences Instance
        val sharedPreferences = getPreferences(Context.MODE_PRIVATE)

        // Assign the alreadyLaunched to a sharedPreferences value
        val alreadyLaunched = sharedPreferences.getBoolean("alreadyLaunched", false)

        if(alreadyLaunched){
            goToDashboardActivity()
        }

        goToDashboard.setOnClickListener {
            // Get sharedPreferences editor
            val editor = sharedPreferences.edit()

            // Edit the alreadyLaunched value and save changes
            editor.putBoolean("alreadyLaunched", true)
            editor.apply()

            goToDashboardActivity()
        }

    }

    private fun goToDashboardActivity(){
        val dashboardActivity = Intent(this, MainActivity::class.java)
        startActivity(dashboardActivity)
        finish()
    }
}
