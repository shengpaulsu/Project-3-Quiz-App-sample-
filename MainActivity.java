package com.example.android.quizapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int score;
    /**
     * This method is called when the submit button is clicked.
     */
    public void submitButton(View view) {
        CheckBox checkBox1 = (CheckBox) findViewById(R.id.checkBox1);
        CheckBox checkBox2 = (CheckBox) findViewById(R.id.checkBox2);
        CheckBox checkBox3 = (CheckBox) findViewById(R.id.checkBox3);
        CheckBox checkBox4 = (CheckBox) findViewById(R.id.checkBox4);
        CheckBox checkBox5 = (CheckBox) findViewById(R.id.checkBox5);
        CheckBox checkBox6 = (CheckBox) findViewById(R.id.checkBox6);
        CheckBox checkBox7 = (CheckBox) findViewById(R.id.checkBox7);
        CheckBox checkBox8 = (CheckBox) findViewById(R.id.checkBox8);
        CheckBox checkBox9 = (CheckBox) findViewById(R.id.checkBox9);
        RadioButton radioButton10 = (RadioButton) findViewById(R.id.radioButton10);
        RadioButton radioButton11 = (RadioButton) findViewById(R.id.radioButton11);
        RadioButton radioButton12 = (RadioButton) findViewById(R.id.radioButton12);


        boolean checkAnswer;
        if (checkBox1.isChecked()) checkAnswer = true;
        else checkAnswer = false;

        boolean checkAnswer2;
        if (checkBox2.isChecked()) checkAnswer2 = true;
        else checkAnswer2 = false;

        boolean checkAnswer3;
        if (checkBox3.isChecked()) checkAnswer3 = true;
        else checkAnswer3 = false;

        boolean checkAnswer4;
        if (checkBox4.isChecked()) checkAnswer4 = true;
        else checkAnswer4 = false;

        boolean checkAnswer5;
        if (checkBox5.isChecked()) checkAnswer5 = true;
        else checkAnswer5 = false;

        boolean checkAnswer6;
        if (checkBox6.isChecked()) checkAnswer6 = true;
        else checkAnswer6 = false;

        boolean checkAnswer7;
        if (checkBox7.isChecked()) checkAnswer7 = true;
        else checkAnswer7 = false;

        boolean checkAnswer8;
        if (checkBox8.isChecked()) checkAnswer8 = true;
        else checkAnswer8 = false;

        boolean checkAnswer9;
        if (checkBox9.isChecked()) checkAnswer9 = true;
        else checkAnswer9 = false;

        boolean checkAnswer10;
        if (radioButton10.isChecked()) checkAnswer10 = true;
        else checkAnswer10 = false;

        boolean checkAnswer11;
        if (radioButton11.isChecked()) checkAnswer11 = true;
        else checkAnswer11 = false;

        boolean checkAnswer12;
        if (radioButton12.isChecked()) checkAnswer12 = true;
        else checkAnswer12 = false;

        boolean correctAnswers;
        if (checkBox2.isChecked()
            &&checkBox4.isChecked()
            &&checkBox9.isChecked()
            &&radioButton10.isChecked())
            score ++;

        String message = submitButtonMessage(checkAnswer, checkAnswer2, checkAnswer3,
                checkAnswer4,checkAnswer5,checkAnswer6,
                checkAnswer7, checkAnswer8, checkAnswer9,
                checkAnswer10, checkAnswer11, checkAnswer12);
        displayMessage(message);
    }
    /**
     * This method stores the variable string submitButtonMessage
     */
    private String submitButtonMessage(boolean checkAnswer, boolean checkAnswer2, boolean checkAnswer3,
                                       boolean checkAnswer4, boolean checkAnswer5, boolean checkAnswer6,
                                       boolean checkAnswer7, boolean checkAnswer8, boolean checkAnswer9,
                                       boolean checkAnswer10, boolean checkAnswer11, boolean checkAnswer12) {
        String message = "Check Answers:";
        Toast.makeText(getApplicationContext(),
                "Answer: (Q1)b/IsChecked1:true, (Q2)a/IsChecked4:true, (Q3)c/IsChecked9:true, (Q4)a/IsChecked11:true", Toast.LENGTH_LONG).show();
        message += "\nCorrectAnswers: " + score + "/4";
        message += "\nIsChecked1: " + checkAnswer;
        message += "\nIsChecked2: " + checkAnswer2;
        message += "\nIsChecked3: " + checkAnswer3;
        message += "\nIsChecked4: " + checkAnswer4;
        message += "\nIsChecked5: " + checkAnswer5;
        message += "\nIsChecked6: " + checkAnswer6;
        message += "\nIsChecked7: " + checkAnswer7;
        message += "\nIsChecked8: " + checkAnswer8;
        message += "\nIsChecked9: " + checkAnswer9;
        message += "\nIsChecked10: " + checkAnswer10;
        message += "\nIsChecked11: " + checkAnswer11;
        message += "\nIsChecked12: " + checkAnswer12;
        return message;
    }
    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(message);
    }
}