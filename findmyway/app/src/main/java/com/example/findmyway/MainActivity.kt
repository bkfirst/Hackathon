package com.example.findmyway

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val aboutButton: Button = findViewById(R.id.aboutButton)
        aboutButton.setOnClickListener {
            // Navigate to AboutActivity
            val intent = Intent(this, AboutActivity::class.java)
            startActivity(intent)
        }
    }
}
