package com.example.homework_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Options extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(convertCodeTheme(getAppTheme()));
        setContentView(R.layout.activity_options);
        initChanger();
    }

    private int myCoolStyle = 0;
    private final int darkTheme = 1;
    private final int lightTheme = 2;
    private final String keyMode = "key";
    private final String keyTheme = "theme";

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

    private int getAppTheme() {
        int codeStyle = myCoolStyle;
        SharedPreferences sharedPreferences = getSharedPreferences(keyMode, codeStyle);
        return sharedPreferences.getInt(keyTheme, codeStyle);

    }
}