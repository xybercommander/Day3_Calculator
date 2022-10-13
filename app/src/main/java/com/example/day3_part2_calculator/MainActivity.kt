package com.example.day3_part2_calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val num1 = findViewById<EditText>(R.id.num1)
        val num2 = findViewById<EditText>(R.id.num2)

        val addButton = findViewById<Button>(R.id.add)
        val subButton = findViewById<Button>(R.id.sub)
        val multButton = findViewById<Button>(R.id.mult)
        val divButton = findViewById<Button>(R.id.div)

        val result = findViewById<TextView>(R.id.result)
        val clearButton = findViewById<Button>(R.id.clear)

        //------ ADD BUTTON ------//
        addButton.setOnClickListener(View.OnClickListener {
            if(checkIntegers() == true) {
                val number1 = num1.text.toString().toInt()
                val number2 = num2.text.toString().toInt()
                val addResult = number1 + number2
                result.text = addResult.toString()
            } else {
                result.text = "Please give valid numbers Bruh!"
            }
        })

        //------ ADD BUTTON ------//
        subButton.setOnClickListener(View.OnClickListener {
            if(checkIntegers() == true) {
                val number1 = num1.text.toString().toInt()
                val number2 = num2.text.toString().toInt()
                val subResult = number1 - number2
                result.text = subResult.toString()
            } else {
                result.text = "Please give valid numbers Bruh!"
            }
        })

        //------ ADD BUTTON ------//
        multButton.setOnClickListener(View.OnClickListener {
            if(checkIntegers() == true) {
                val number1 = num1.text.toString().toInt()
                val number2 = num2.text.toString().toInt()
                val multResult = number1 * number2
                result.text = multResult.toString()
            } else {
                result.text = "Please give valid numbers Bruh!"
            }
        })

        //------ ADD BUTTON ------//
        divButton.setOnClickListener(View.OnClickListener {
            if(checkIntegers() == true) {
                val number1 = num1.text.toString().toInt()
                val number2 = num2.text.toString().toInt()
                val divResult = number1 / number2
                result.text = divResult.toString()
            } else {
                result.text = "Please give valid numbers Bruh!"
            }
        })

        //------ CLEAR BUTTON ------//
        clearButton.setOnClickListener(View.OnClickListener {
            num1.setText("")
            num2.setText("")
            result.setText("")
        })
    }

    fun checkIntegers(): Boolean {
        val num1 = findViewById<EditText>(R.id.num1)
        val num2 = findViewById<EditText>(R.id.num2)

        var flag: Boolean = true
        if(num1.text.toString() == "" || num2.text.toString() == "") {
            flag = false
        }

        return flag
    }
}