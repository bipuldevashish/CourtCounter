package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreForTeamA = 0;
    int scoreForTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addThreePointsForTeamA(View view){
        scoreForTeamA = scoreForTeamA + 3;
        displayForTeamA(scoreForTeamA);
    }

    public void addTwoPointsForTeamA(View view){
        scoreForTeamA = scoreForTeamA + 2;
        displayForTeamA(scoreForTeamA);
    }

    public void addFreeThrowForTeamA(View view){
        scoreForTeamA = scoreForTeamA + 1;
        displayForTeamA(scoreForTeamA);
    }

    public void displayForTeamA(int score){
        TextView textView = findViewById(R.id.scoreTeamA);
        textView.setText(String.valueOf(score));
    }


    // For Team B


    public void addThreePointsForTeamB(View view){
        scoreForTeamB = scoreForTeamB + 3;
        displayForTeamB(scoreForTeamB);
    }

    public void addTwoPointsForTeamB(View view){
        scoreForTeamB = scoreForTeamB + 2;
        displayForTeamB(scoreForTeamB);
    }

    public void addFreeThrowForTeamB(View view){
        scoreForTeamB = scoreForTeamB + 1;
        displayForTeamB(scoreForTeamB);
    }

    public void displayForTeamB(int score){
        TextView textView = findViewById(R.id.scoreTeamB);
        textView.setText(String.valueOf(score));
    }

    // For Reset Button

    public void reset(View view){
        TextView textViewA = findViewById(R.id.scoreTeamA);
        textViewA.setText(String.valueOf(0));
        TextView textViewB = findViewById(R.id.scoreTeamB);
        textViewB.setText(String.valueOf(0));
    }
}
