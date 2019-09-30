package com.example.marvelacademysharedpreferences

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_tutorial.*

class TutorialActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tutorial)

        goToDashboard.setOnClickListener {
            val dashboardActivity = Intent(this, MainActivity::class.java)
            startActivity(dashboardActivity)
            finish()
        }
    }
}
