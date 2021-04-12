package com.example.csis401orderprints

import android.os.Bundle
import android.view.View
import android.widget.*
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun radioButtonClick(view: View) {
        if (fourBySix.isChecked) {
            result.text= "Your total cost is $" + numberInput.toString().toInt()*0.19
                }

        else if (fiveBySeven.isChecked) {
            result.text= "Your total cost is $" + numberInput.toString().toInt()*0.49
                }

        else if (eightByTen.isChecked) {
            result.text= "Your total cost is $" + numberInput.toString().toInt()*0.79
               }
    }


    fun buttonClick(view:View){





    }


}