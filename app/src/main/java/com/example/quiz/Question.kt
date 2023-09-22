package com.example.quiz

data class Question(

    val id : Int ,
    val question: String ,
    val image : Int ,
    val optionOne : String,
    val optionTow : String,
    val optionThree : String,
    val optionFour : String ,
    val correctAnswer :Int

//this is data class , it means here i have to tell about my data , witch i am going to use in the app


    )
