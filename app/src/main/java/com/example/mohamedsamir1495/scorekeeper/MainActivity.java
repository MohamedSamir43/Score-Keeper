package com.example.mohamedsamir1495.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Tracks the score for Team A
    int scoreTeamA = 0;

    // Tracks the score for Team B
    int scoreTeamB = 0;

    //Reference to the buttons in the layout
    Button twoPointsBtnTeamA, onePointBtnTeamA, twoPointsBtnTeamB, onePointBtnTeamB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        twoPointsBtnTeamA = (Button) findViewById(R.id.twoPointsTeamA);
        twoPointsBtnTeamB = (Button) findViewById(R.id.twoPointsTeamB);

        onePointBtnTeamA = (Button) findViewById(R.id.ownPointTeamA);
        onePointBtnTeamB = (Button) findViewById(R.id.ownPointTeamB);

    }

    /**
     * Increase the score for Team A by 6 points.
     */
    public void touchDownClickTeamA(View v) {
        scoreTeamA = scoreTeamA + 6;
        disableAllButton();
        twoPointsBtnTeamA.setEnabled(true);
        onePointBtnTeamA.setEnabled(true);
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the score for Team A by 3 point.
     */
    public void fieldGoalClickTeamA(View v) {
        scoreTeamA = scoreTeamA + 3;
        disableAllButton();
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the score for Team A by 2 point.
     */
    public void safetyClickTeamA(View v) {
        scoreTeamA = scoreTeamA + 2;
        disableAllButton();
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the score for Team A by 2 points.
     */
    public void twoPointConversionClickTeamA(View v) {
        scoreTeamA = scoreTeamA + 2;
        disableAllButton();
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the score for Team A by 1 points.
     */
    public void extraPointClickTeamA(View v) {
        scoreTeamA = scoreTeamA + 1;
        disableAllButton();
        displayForTeamA(scoreTeamA);
    }


    /**
     * Increase the score for Team B by 6 points.
     */
    public void touchDownClickTeamB(View v) {
        scoreTeamB = scoreTeamB + 6;
        disableAllButton();
        twoPointsBtnTeamB.setEnabled(true);
        onePointBtnTeamB.setEnabled(true);
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increase the score for Team B by 3 point.
     */
    public void fieldGoalClickTeamB(View v) {
        scoreTeamB = scoreTeamB + 3;
        disableAllButton();
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increase the score for Team B by 2 point.
     */
    public void safetyClickTeamB(View v) {
        scoreTeamB = scoreTeamB + 2;
        disableAllButton();
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increase the score for Team B by 2 points.
     */
    public void twoPointConversionClickTeamB(View v) {
        scoreTeamB = scoreTeamB + 2;
        disableAllButton();
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increase the score for Team B by 1 point.
     */
    public void extraPointClickTeamB(View v) {
        scoreTeamB = scoreTeamB + 1;
        disableAllButton();
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

    /**
     * Resets the score for both teams back to 0.
     */
    public void resetScore(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    // Disables all buttons again
    public void disableAllButton() {
        twoPointsBtnTeamA.setEnabled(false);
        twoPointsBtnTeamB.setEnabled(false);
        onePointBtnTeamA.setEnabled(false);
        onePointBtnTeamB.setEnabled(false);
    }

}
