package com.example.homework_3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ComponentActivity;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.Serializable;
import java.util.Locale;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, Serializable {


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
    Button divide;
    Button multiply;
    Button enter;
    Button minus;
    Button plus;
    Button dot;

    TextView textNumber;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(convertCodeTheme(getAppTheme()));
        setContentView(R.layout.activity_main);
        allButtons();
        textNumber = findViewById(R.id.Numbers);
        initChanger();
    }

    private void allButtons() {
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
        divide = findViewById(R.id.button_divide);
        divide.setOnClickListener(this);
        multiply = findViewById(R.id.button_multiply);
        multiply.setOnClickListener(this);
        enter = findViewById(R.id.button_equal);
        enter.setOnClickListener(this);
        minus = findViewById(R.id.button_minus);
        minus.setOnClickListener(this);
        plus = findViewById(R.id.button_plus);
        plus.setOnClickListener(this);
        dot = findViewById(R.id.button_dot);
        dot.setOnClickListener(this);
    }

    private int myCoolStyle = 0;
    private final int darkTheme = 1;
    private final int lightTheme = 2;
    private String keyMode = "key";
    private String keyTheme = "theme";

    private void initChanger() {
        Button lightButton = findViewById(R.id.buttonLight);
        lightButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sp = getSharedPreferences(keyMode, MODE_PRIVATE);
                SharedPreferences.Editor editor = sp.edit();
                editor.putInt(keyTheme, 2);
                editor.apply();
                recreate();
            }
        });
        Button darkButton = findViewById(R.id.buttonDark);
        darkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SharedPreferences sp = getSharedPreferences(keyMode, MODE_PRIVATE);
                SharedPreferences.Editor editor = sp.edit();
                editor.putInt(keyTheme, 1);
                editor.apply();
                recreate();
            }
        });
    }

    private int convertCodeTheme(int codeStyle) {
        switch (codeStyle) {
            case darkTheme:
                return R.style.DarkTheme;
            case lightTheme:
                return R.style.LightTheme;
            default:
                return R.style.MyCoolStyle;

        }
    }
    private int getAppTheme () {
        int codeStyle = myCoolStyle;
        SharedPreferences sharedPreferences = getSharedPreferences(keyMode,codeStyle);
        return sharedPreferences.getInt(keyTheme,codeStyle);
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
            case R.id.button_divide:
                textNumber.append("/");
                break;
            case R.id.button_multiply:
                textNumber.append("x");
                break;
            case R.id.button_plus:
                textNumber.append("+");
                break;
            case R.id.button_minus:
                textNumber.append("-");
                break;
            case R.id.button_equal:
                textNumber.append("=");
                break;
            case R.id.button_dot:
                textNumber.append(".");
                break;

        }

    }


}

