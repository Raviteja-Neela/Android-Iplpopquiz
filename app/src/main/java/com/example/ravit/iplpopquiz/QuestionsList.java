package com.example.ravit.iplpopquiz;

// This file contains questions from QuestionBank

import android.util.Log;

public class QuestionsList {

    int num=0;
    // array of questions
    private String textQuestions [] = {
            "1. Who has won the Orange Cap in 2017 IPL?",
            "2. Who has scored the highest number of individual score in 2012??",
            "3. Who has scored the highest number of Sixes in 2016 IPL?",
            "4. Who has taken the highest number of Wickets in IPL history?",
            "5. Who has taken highest number of hattricks in IPL history?",
            "6. Who has taken highest number of fours in IPL history?",
            "7. Who has scored the highest number of individual score in 2017?",
            "8. Who has scored the highest number of runs in 2016 IPL?",
            "9. Who has won the Orange Cap in 2015 IPL ?",
            "10. Who has scored the highest number of Sixes in IPL history?",
            "11. Who has won the Orange Cap in 2014 IPL?",
            "12. Who has scored the highest number of individual score in 2008?",
            "13. Who has scored the highest number of Sixes in 2014 IPL?"
    };

    // array of multiple choices for each question
    private String multipleChoice [][] = {
            {"Shikhar Dhawan", "Steve Smith", "David Warner", "Gautam Gambhir"},
            {"David Warner", "Chris Gayle", "Murali Vijay", "Rohit Sharma"},
            {"Virat Kohli", "David Warner", "Glenn Maxwell", "Gautham Gambhir"},
            {"Amit Mishra", "Harbhajan Singh", "Piyush Chawla", "Lasith Malinga"},
            {"Harbhajan Singh", "Piyush Chawla", "Amit Mishra","Lasith Malinga"},
            {"David Warner", "Gautham Gambhir", "Suresh Raina","Shikhar Dhawan"},
            {"Ben Stokes", "Sanju Samson", "David Warner", "Hashim Amla"},
            {"David Warner", "Virat Kohli", "AB de Villiers", "Gautham Gambhir"},
            {"David Warner", "Ajinkya Rahane", "Lendl Simmons", "AB de Villiers"},
            {"Suresh Raina", "Rohit Sharma", "Chris Gayle", "David Warner"},
            {"Dwayne Smith", "Glenn Maxwell", "David Warner", "Robin Uthappa"},
            {"Andrew Symonds", "Michel Hussey", "Shaun Marsh", "Brendon McCullum"},
            {"Virat Kohli", "David Warner", "Glenn Maxwell", "Gautham Gambhir"}
    };

    // array of correct answers - in the same order as array of questions
    private String mCorrectAnswers[] = {"David Warner", "Chris Gayle", "Virat Kohli" , "Lasith Malinga", "Amit Mishra",
                                        "Gautham Gambhir", "David Warner", "Virat Kohli", "David Warner", "Chris Gayle",
                                        "Robin Uthappa", "Brendon McCullum", "Glenn Maxwell"};

    // method returns number of questions
    public int getLength(){

        num=textQuestions.length;
        Log.d("100","The total number of questions"+num);
        return textQuestions.length;
    }

    // method returns question from array textQuestions[] based on array index
    public String getQuestion(int a) {
        String question = textQuestions[a];
        return question;
    }

    // method return a single multiple choice item for question based on array index,
    // based on number of multiple choice item in the list - 1, 2, 3 or 4 as an argument
    public String getChoice(int index, int num) {
        String choice0 = multipleChoice[index][num-1];
        return choice0;
    }

    //  method returns correct answer for the question based on array index
    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }
}