package com.example.kotlincalculation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var num1: Int? = null
    var num2: Int? = null
    var res: Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sum(view: View) {
        num1 = number1.text.toString().toIntOrNull()
        num2 = number2.text.toString().toInt()

        if (num1 == null || num2 == null) {

            textView.text = "Error"

        } else {
            res = num1!! + num2!!
            textView.text = res.toString()

        }

    }

    fun sub(view: View) {

        val a = number1.text.toString().toInt()
        val b = number2.text.toString().toInt()

        val result = a - b

        textView.text = "Result: " + result

    }

    fun multiply(view: View) {
        val a = number1.text.toString().toInt()
        val b = number2.text.toString().toInt()

        val result = a * b

        textView.text = "Result: " + result

    }

    fun div(view: View) {
        val a = number1.text.toString().toInt()
        val b = number2.text.toString().toInt()

        val result = a / b

        textView.text = "Result: " + result


    }
}