package com.example.quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.result.ActivityResult
import com.example.quiz.databinding.ActivityResultBinding

class resultActivity : AppCompatActivity() {
    private lateinit var binding: ActivityResultBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.tvName.text = intent.getStringExtra(Constants.USER_NAME)

        val totalQuestions = intent.getIntExtra(Constants.TOTAL_QUESTION , 0 )
        val correctAnswers = intent.getIntExtra(Constants.CORRECT_ANSWERS , 0)


        binding.tvScore.text = "Your Score is $correctAnswers out of $totalQuestions"


        binding.btnFinish.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
        }



    }
}