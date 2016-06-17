package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    final int freeThrowPoints = 1;
    final int twoPointerPoints = 2;
    final int threePointerPoints = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This is called when Team A makes a point; calculates score based on basket type.
     */
    public void teamAMakesBasket(View v) {
        switch(v.getId()){
            case (R.id.teamA_add1):
                scoreTeamA = scoreTeamA + freeThrowPoints;
                displayForTeamA(scoreTeamA);
                break;
            case (R.id.teamA_add2):
                scoreTeamA = scoreTeamA + twoPointerPoints;
                displayForTeamA(scoreTeamA);
                break;
            case (R.id.teamA_add3):
                scoreTeamA = scoreTeamA + threePointerPoints;
                displayForTeamA(scoreTeamA);
                break;
        }
    }

    /**
     * This is called when Team B makes a point; calculates score based on basket type.
     */
    public void teamBMakesBasket(View v) {
        switch(v.getId()){
            case (R.id.teamB_add1):
                scoreTeamB = scoreTeamB + freeThrowPoints;
                displayForTeamB(scoreTeamB);
                break;
            case (R.id.teamB_add2):
                scoreTeamB = scoreTeamB + twoPointerPoints;
                displayForTeamB(scoreTeamB);
                break;
            case (R.id.teamB_add3):
                scoreTeamB = scoreTeamB + threePointerPoints;
                displayForTeamB(scoreTeamB);
                break;
        }
    }

    /**
     * Reset all scores to 0
     */
    public void resetAllScores(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;

        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}
