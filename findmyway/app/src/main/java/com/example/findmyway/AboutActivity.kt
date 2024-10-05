package com.example.findmyway

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class AboutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        val backButton: Button = findViewById(R.id.backButton)
        backButton.setOnClickListener {
            // Navigate back to MainActivity
            finish() // This will close AboutActivity and return to MainActivity
        }
    }
}
