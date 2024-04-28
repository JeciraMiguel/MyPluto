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

        // Logic for feeding the pet
        feedButton.setOnClickListener {
            // Update pet image
            petImage.setImageResource(R.drawable.dog_eating)

            // Update status values
            health = health - 10
            hunger = hunger + 20
            cleanliness = cleanliness - 5

            // Update status display
            updatePetStatus()
        }

        // Logic for cleaning the pet
        cleanButton.setOnClickListener {
            // Update pet image
            petImage.setImageResource(R.drawable.dog_clean)

            // Update status values
            health = health - 5
            cleanliness = cleanliness + 20

            // Update status display
            updatePetStatus()
        }
    }

    // Update pet status display
    private fun updatePetStatus() {
        val healthTextView: TextView = findViewById(R.id.valueHappy)
        val hungerTextView: TextView = findViewById(R.id.valueHunger)
        val cleanlinessTextView: TextView = findViewById(R.id.valueClear)

        // Set status values in corresponding TextViews
        healthTextView.text = "$health"
        hungerTextView.text = "$hunger"
        cleanlinessTextView.text = "$cleanliness"
    }

}
