package com.example.android.bwm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;

public class exercise extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise);
        TextView exerciseDescTxtView = (TextView) findViewById(R.id.exercise_desc_text_view);
        exerciseDescTxtView.setMovementMethod(new ScrollingMovementMethod());

        TextView studyCategText = (TextView) findViewById(R.id.exercise_activity_study_menu);
        studyCategText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent studyIntent = new Intent(exercise.this, study.class);
                startActivity(studyIntent);
            }
        });

        TextView workCategText = (TextView) findViewById(R.id.exercise_activity_work_menu);
        workCategText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent workIntent = new Intent(exercise.this, work.class);
                startActivity(workIntent);
            }
        });

        TextView homeCategText = (TextView) findViewById(R.id.exercise_activity_home_menu);
        homeCategText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(exercise.this, categories.class);
                startActivity(homeIntent);
            }
        });

        TextView playOneCategText = (TextView) findViewById(R.id.play_exercise_song_1);
        playOneCategText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playOneIntent = new Intent(exercise.this, now_playing.class);
                startActivity(playOneIntent);
            }
        });

        TextView playTwoCategText = (TextView) findViewById(R.id.play_exercise_song_2);
        playTwoCategText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playTwoIntent = new Intent(exercise.this, now_playing.class);
                startActivity(playTwoIntent);
            }
        });

        TextView exerciseBuyTextView = (TextView) findViewById(R.id.exercise_buy_text_view);
        exerciseBuyTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent exerciseBuyIntent = new Intent(exercise.this, payment.class);
                startActivity(exerciseBuyIntent);
            }
        });
    }
}
