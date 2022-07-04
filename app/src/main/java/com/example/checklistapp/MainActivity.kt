package com.example.checklistapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.checklistapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAddField.setOnClickListener{
            binding.scrollView.addView(binding.scrollView.findViewById(R.id.et_textInput))
        }


    }
}