package com.jeciramiguel.mypluto

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class GameActivity : AppCompatActivity() {
    // Pet states
    private var health: Int = 100
    private var hunger: Int = 0
    private var cleanliness: Int = 100

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        // Initialize views
        val petImage: ImageView = findViewById(R.id.petImage)
        val feedButton: Button = findViewById(R.id.feedButton)
        val cleanButton: Button = findViewById(R.id.cleanButton)
        val playButton: Button = findViewById(R.id.playButton)

    }

}
