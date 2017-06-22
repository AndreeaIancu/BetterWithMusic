package com.example.android.bwm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;

public class work extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work);

        TextView workDescTxtView = (TextView) findViewById(R.id.work_desc_text_view);
        workDescTxtView.setMovementMethod(new ScrollingMovementMethod());

        TextView studyCategText = (TextView) findViewById(R.id.work_activity_study_menu);
        studyCategText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent studyIntent = new Intent(work.this, study.class);
                startActivity(studyIntent);
            }
        });

        TextView exerciseCategText = (TextView) findViewById(R.id.work_activity_exercise_menu);
        exerciseCategText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent exerciseIntent = new Intent(work.this, exercise.class);
                startActivity(exerciseIntent);
            }
        });

        TextView homeCategText = (TextView) findViewById(R.id.work_activity_home_menu);
        homeCategText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(work.this, categories.class);
                startActivity(homeIntent);
            }
        });
        TextView playOneCategText = (TextView) findViewById(R.id.play_work_song_1);
        playOneCategText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playOneIntent = new Intent(work.this, now_playing.class);
                startActivity(playOneIntent);
            }
        });

        TextView playTwoCategText = (TextView) findViewById(R.id.play_work_song_2);
        playTwoCategText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playTwoIntent = new Intent(work.this, now_playing.class);
                startActivity(playTwoIntent);
            }
        });
    }
}
