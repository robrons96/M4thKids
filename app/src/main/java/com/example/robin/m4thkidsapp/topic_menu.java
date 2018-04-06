package com.example.robin.m4thkidsapp;

import android.annotation.SuppressLint;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.Random;

public class topic_menu extends AppCompatActivity {
    public static int level;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String [] array1= {"Medium", "adding", "multiple choice", "Sally has *BLANK* apples. She gets another *BLANK* from Bill, and *BLANK* from Kate. How many does she have now?", "5", "4, 3, 5, 0", "green", "no", "Yes", "no"};

        for(int i = 0; i < 10; i ++)
        {
            DbHelper.getsInstance(getApplicationContext()).addQuestion(array1);
        }
        setContentView(R.layout.activity_topic_menu);
        Button button = (Button)findViewById(R.id.button);
        Button button2 = (Button)findViewById(R.id.button2);

        if(level == 0) {
            button.setText(R.string.comparing);
            button2.setText(R.string.counting);
        }
        if(level == 1) {
            button.setText(R.string.adding);
            button2.setText(R.string.subing);
        }
        if(level == 2) {
            button.setText(R.string.times);
            button2.setText(R.string.divide);
        }

    }
//comment
    public void buttonOnClick(View v) {
        Questions q = new Questions();
        Button button1 = (Button) v;
        q.topic = ((Button) v).getText().toString();
        Intent intent = new Intent(this, Questions.class);
        startActivity(intent);
    }
}