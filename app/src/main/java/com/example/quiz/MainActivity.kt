package com.example.quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.quiz.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding // Declare binding as lateinit

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root) // Use binding.root to set content view

        binding.startbtn.setOnClickListener {
            if (binding.etName.text.toString().isEmpty()) {
                Toast.makeText(this, "Please Enter Your Name", Toast.LENGTH_SHORT).show()
            } else {
                val intent = Intent(this, quiz_q_Activity::class.java)
                startActivity(intent)
                finish()
            }
        }
    }
}
