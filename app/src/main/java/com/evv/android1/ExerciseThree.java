package com.evv.android1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ExerciseThree extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise_three);
    }
    public void toMain (View view) {
        Intent intent = new Intent(this, StartActivity.class);
        startActivity(intent);
    }
}