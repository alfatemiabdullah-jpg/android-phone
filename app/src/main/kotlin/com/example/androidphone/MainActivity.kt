package com.example.androidphone

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.androidphone.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Initialize view binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Set up UI elements
        setupUI()
    }

    private fun setupUI() {
        // Set welcome message
        binding.welcomeText.text = "مرحبا بك في تطبيق الهاتف الذكي"

        // Set up button click listener
        binding.clickButton.setOnClickListener {
            onButtonClicked()
        }
    }

    private fun onButtonClicked() {
        binding.welcomeText.text = "تم النقر على الزر! 🎉"
    }
}
