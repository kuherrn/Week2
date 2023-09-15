package com.example.week2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.week2.databinding.ActivityClassBinding
import com.example.week2.databinding.ActivityMainBinding

class ClassActivity : AppCompatActivity() {
    private lateinit var binding : ActivityClassBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityClassBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}