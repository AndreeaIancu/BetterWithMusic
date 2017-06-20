package com.example.android.bwm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class study extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study);

        TextView workCategText = (TextView) findViewById(R.id.study_activity_work_menu);
        workCategText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent workIntent = new Intent(study.this, work.class);
                startActivity(workIntent);
            }
        });

        TextView exerciseCategText = (TextView) findViewById(R.id.study_activity_exercise_menu);
        exerciseCategText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent exerciseIntent = new Intent(study.this, exercise.class);
                startActivity(exerciseIntent);
            }
        });

        TextView homeCategText = (TextView) findViewById(R.id.study_activity_home_menu);
        homeCategText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(study.this, categories.class);
                startActivity(homeIntent);
            }
        });
        TextView playOneCategText = (TextView) findViewById(R.id.play_study_song_1);
        playOneCategText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playOneIntent = new Intent(study.this, now_playing.class);
                startActivity(playOneIntent);
            }
        });

        TextView playTwoCategText = (TextView) findViewById(R.id.play_study_song_2);
        playTwoCategText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playTwoIntent = new Intent(study.this, now_playing.class);
                startActivity(playTwoIntent);
            }
        });

        TextView playThreeCategText = (TextView) findViewById(R.id.play_study_song_3);
        playThreeCategText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playThreeIntent = new Intent(study.this, now_playing.class);
                startActivity(playThreeIntent);
            }
        });


    }
}
