package com.example.homework_3

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.io.Serializable

internal class MainActivity : AppCompatActivity(), View.OnClickListener, Serializable {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        allButtons()
    }

    private fun allButtons() {
        val buttonZero: Button = findViewById(R.id.button_0)
        buttonZero.setOnClickListener(this)
        val buttonOne: Button = findViewById(R.id.button_1)
        buttonOne.setOnClickListener(this)
        val buttonTwo: Button = findViewById(R.id.button_2)
        buttonTwo.setOnClickListener(this)
        val buttonThree: Button = findViewById(R.id.button_3)
        buttonThree.setOnClickListener(this)
        val buttonFour: Button = findViewById(R.id.button_4)
        buttonFour.setOnClickListener(this)
        val buttonFive: Button = findViewById(R.id.button_5)
        buttonFive.setOnClickListener(this)
        val buttonSix: Button = findViewById(R.id.button_6)
        buttonSix.setOnClickListener(this)
        val buttonSeven: Button = findViewById(R.id.button_7)
        buttonSeven.setOnClickListener(this)
        val buttonEight: Button = findViewById(R.id.button_8)
        buttonEight.setOnClickListener(this)
        val buttonNine: Button = findViewById(R.id.button_9)
        buttonNine.setOnClickListener(this)
        val divide: Button = findViewById(R.id.button_divide)
        divide.setOnClickListener(this)
        val multiply: Button = findViewById(R.id.button_multiply)
        multiply.setOnClickListener(this)
        val enter: Button = findViewById(R.id.button_equal)
        enter.setOnClickListener(this)
        val minus: Button = findViewById(R.id.button_minus)
        minus.setOnClickListener(this)
        val plus: Button = findViewById(R.id.button_plus)
        plus.setOnClickListener(this)
        val dot: Button = findViewById(R.id.button_dot)
        dot.setOnClickListener(this)
        val options: Button = findViewById(R.id.Options)
        options.setOnClickListener(this)
    }


    override fun onClick(v: View) {
        val intent: Intent
        val textNumber: TextView = findViewById(R.id.Numbers)
        when (v.id) {
            R.id.button_0 -> textNumber.append("0")
            R.id.button_1 -> textNumber.append("1")
            R.id.button_2 -> textNumber.append("2")
            R.id.button_3 -> textNumber.append("3")
            R.id.button_4 -> textNumber.append("4")
            R.id.button_5 -> textNumber.append("5")
            R.id.button_6 -> textNumber.append("6")
            R.id.button_7 -> textNumber.append("7")
            R.id.button_8 -> textNumber.append("8")
            R.id.button_9 -> textNumber.append("9")
            R.id.button_divide -> textNumber.append("/")
            R.id.button_multiply -> textNumber.append("x")
            R.id.button_plus -> textNumber.append("+")
            R.id.button_minus -> textNumber.append("-")
            R.id.button_equal -> textNumber.append("=")
            R.id.button_dot -> textNumber.append(".")
            R.id.Options -> {
                intent = Intent(this, com.example.homework_3.Options::class.java)
                startActivity(intent)
            }
        }
    }
}