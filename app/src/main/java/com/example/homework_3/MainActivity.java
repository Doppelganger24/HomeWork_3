package com.example.homework_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ComponentActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    Button buttonZero;
    Button buttonOne;
    Button buttonTwo;
    Button buttonThree;
    Button buttonFour;
    Button buttonFive;
    Button buttonSix;
    Button buttonSeven;
    Button buttonEight;
    Button buttonNine;

    TextView textNumber;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonZero = findViewById(R.id.button_0);
        buttonZero.setOnClickListener(this);
        buttonOne = findViewById(R.id.button_1);
        buttonOne.setOnClickListener(this);
        buttonTwo = findViewById(R.id.button_2);
        buttonTwo.setOnClickListener(this);
        buttonThree = findViewById(R.id.button_3);
        buttonThree.setOnClickListener(this);
        buttonFour = findViewById(R.id.button_4);
        buttonFour.setOnClickListener(this);
        buttonFive = findViewById(R.id.button_5);
        buttonFive.setOnClickListener(this);
        buttonSix = findViewById(R.id.button_6);
        buttonSix.setOnClickListener(this);
        buttonSeven = findViewById(R.id.button_7);
        buttonSeven.setOnClickListener(this);
        buttonEight = findViewById(R.id.button_8);
        buttonEight.setOnClickListener(this);
        buttonNine = findViewById(R.id.button_9);
        buttonNine.setOnClickListener(this);
        textNumber = findViewById(R.id.Numbers);
    }


    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_0:
                textNumber.append("0");
                break;
            case R.id.button_1:
                textNumber.append("1");
                break;
            case R.id.button_2:
                textNumber.append("2");
                break;
            case R.id.button_3:
                textNumber.append("3");
                break;
            case R.id.button_4:
                textNumber.append("4");
                break;
            case R.id.button_5:
                textNumber.append("5");
                break;
            case R.id.button_6:
                textNumber.append("6");
                break;
            case R.id.button_7:
                textNumber.append("7");
                break;
            case R.id.button_8:
                textNumber.append("8");
                break;
            case R.id.button_9:
                textNumber.append("9");
                break;
        }

    }


}

