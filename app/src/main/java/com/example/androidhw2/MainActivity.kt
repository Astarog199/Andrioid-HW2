package com.example.androidhw2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.androidhw2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val user = User()
        binding.nameUsers.text =  user.name
        binding.status.text = user.status
    }
}