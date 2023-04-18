package com.example.tapcounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tapcounter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var number = 0

        binding.btnAdd.setOnClickListener {
            number++
            binding.tvCount.text = number.toString()
        }
    }
}