package com.evv.android1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
    }

    public void theFirstExerciseCall (View view) {
        Intent intent = new Intent(this, ExerciseOne.class);
        startActivity(intent);
    }
    public void theSecondExerciseCall (View view) {
        Intent intent = new Intent(this, ExerciseTwo.class);
        startActivity(intent);
    }
    public void theThirdExerciseCall (View view) {
        Intent intent = new Intent(this, ExerciseThree.class);
        startActivity(intent);
    }
    public void theFourthExerciseCall (View view) {
        Intent intent = new Intent(this, ExerciseFour.class);
        startActivity(intent);
    }
}