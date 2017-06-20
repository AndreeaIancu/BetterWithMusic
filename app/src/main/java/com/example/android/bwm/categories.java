package com.example.android.bwm;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class categories extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);

        TextView studyCategText = (TextView) findViewById(R.id.study_category);
        studyCategText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent studyIntent = new Intent(categories.this, study.class);
                startActivity(studyIntent);
            }
        });

        TextView workCategText = (TextView) findViewById(R.id.work_category);
        workCategText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent workIntent = new Intent(categories.this, work.class);
                startActivity(workIntent);
            }
        });

        TextView exerciseCategText = (TextView) findViewById(R.id.exercise_category);
        exerciseCategText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent exerciseIntent = new Intent(categories.this, exercise.class);
                startActivity(exerciseIntent);
            }
        });
    }
}
