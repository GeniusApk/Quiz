package com.example.quiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.quiz.databinding.ActivityQuizQactivityBinding

class quiz_q_Activity : AppCompatActivity() {
    private lateinit var binding: ActivityQuizQactivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuizQactivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
