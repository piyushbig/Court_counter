package com.d7tech.court_counter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int score_of_teamA =0;
    int score_of_teamB =0;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(score_of_teamA);
        displayForTeamB(score_of_teamB);
    }



    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_scoreA);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_scoreB);
        scoreView.setText(String.valueOf(score));
    }
    public void threePointsA(View view) {
        score_of_teamA = score_of_teamA+ 3;

        displayForTeamA(score_of_teamA);


    }
    public void threePointsB(View view) {

        score_of_teamB = score_of_teamB+3;

        displayForTeamB(score_of_teamB);

    }

    public void twoPintsA(View view) {
        score_of_teamA =2;

        displayForTeamA(score_of_teamA);

    }
    public void twoPintsB(View view) {

        score_of_teamB =2;

        displayForTeamB(score_of_teamB);
    }

    public void freethrowA(View view) {
        score_of_teamA=1;

        displayForTeamA(score_of_teamA);

    }
    public void freethrowB(View view) {

        score_of_teamB=1;

        displayForTeamB(score_of_teamB);
    }

    public void reset_score(View view) {

        score_of_teamA=0;
        score_of_teamB=0;
        displayForTeamA(score_of_teamA);
        displayForTeamB(score_of_teamB);
    }
}