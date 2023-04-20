package com.example.tapcounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.tapcounter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var number = 0
        var increment = 1


        // To handle the on click of button
        binding.btnAdd.setOnClickListener {

            number += increment
            binding.tvCount.text = number.toString()
            if (number > 20){
                binding.btnLevel.visibility = View.VISIBLE

                binding.btnLevel.setOnClickListener {
                    binding.btnLevel.visibility = View.GONE
                    increment = 2
                }

            }
        }

    }
}