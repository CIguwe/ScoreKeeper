package com.example.chide.scorekeeper;

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

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void addThreeForTeamA(View view) {
        scoreForTeamA += 3;
        displayForTeamA(scoreForTeamA);
    }
    public void addTwoForTeamA(View view) {
        scoreForTeamA += 2;
        displayForTeamA(scoreForTeamA);
    }
    public void addOneForTeamA(View view) {
        scoreForTeamA += 1;
        displayForTeamA(scoreForTeamA);
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void addThreeForTeamB(View view) {
        scoreForTeamB += 3;
        displayForTeamB(scoreForTeamB);
    }
    public void addTwoForTeamB(View view) {
        scoreForTeamB += 2;
        displayForTeamB(scoreForTeamB);
    }
    public void addOneForTeamB(View view) {
        scoreForTeamB += 1;
        displayForTeamB(scoreForTeamB);
    }

    public void resetScore (View view){
        scoreForTeamA = 0;
        scoreForTeamB = 0;
        displayForTeamA(scoreForTeamA);
        displayForTeamB(scoreForTeamB);
    }
}
