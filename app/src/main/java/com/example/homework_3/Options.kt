package com.example.homework_3

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Options : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(convertCodeTheme(appTheme))
        setContentView(R.layout.activity_options)
        initChanger()
    }

    private val myCoolStyle = 0
    private val darkTheme = 1
    private val lightTheme = 2
    private val keyMode = "key"
    private val keyTheme = "theme"
    private fun initChanger() {
        val lightButton:Button = findViewById (R.id.buttonLight)
        lightButton.setOnClickListener {
            val sp = getSharedPreferences(keyMode, MODE_PRIVATE)
            val editor = sp.edit()
            editor.putInt(keyTheme, 2)
            editor.apply()
            recreate()
        }
        val darkButton = findViewById<Button>(R.id.buttonDark)
        darkButton.setOnClickListener {
            val sp = getSharedPreferences(keyMode, MODE_PRIVATE)
            val editor = sp.edit()
            editor.putInt(keyTheme, 1)
            editor.apply()
            recreate()
        }
    }

    private fun convertCodeTheme(codeStyle: Int): Int {
        return when (codeStyle) {
            darkTheme -> R.style.DarkTheme
            lightTheme -> R.style.LightTheme
            else -> R.style.MyCoolStyle
        }
    }

    private val appTheme: Int
        get() {
            val codeStyle = myCoolStyle
            val sharedPreferences = getSharedPreferences(keyMode, codeStyle)
            return sharedPreferences.getInt(keyTheme, codeStyle)
        }
}