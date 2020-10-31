package com.sunlab.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById<Button>(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }
        val countButton: Button = findViewById(R.id.count_up_button)
        countButton.setOnClickListener { countUp() }
        val resetButton: Button = findViewById(R.id.reset_button)
        resetButton.setOnClickListener { reset() }

    }

    private fun rollDice(){
        val resultText:TextView = findViewById<TextView>(R.id.result_text)
        resultText.text = "Dice Rolled!"
        val randomInt = (1..6).random();
        resultText.text = randomInt.toString()
    }
    private fun countUp(){
        val resultText:TextView = findViewById(R.id.result_text)
        if(resultText.text.toString() == "Hello World!"){
            Log.d("asd","true");
            resultText.text ="1"
        }
        else {
            if (!(resultText.text.toString() == "6")) {
                resultText.text = (Integer.parseInt(resultText.text.toString())+1).toString()
            }
        }
    }
    private fun reset(){
        val resultText:TextView = findViewById<TextView>(R.id.result_text)
        resultText.text = "0"

    }
}