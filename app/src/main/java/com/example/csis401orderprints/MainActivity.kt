package com.example.csis401orderprints

/*Work done by:
Feraas El Sabaa - S00046163
Ali Kasem - S00028064

In collaboration with our colleagues Ahmad Younis S00046274  and Abdulaziz Al-Kandry S00012791
*/

import android.os.Bundle
import android.view.View
import android.widget.*
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    var radioGroup: RadioGroup? = null
    lateinit var radioButton: RadioButton
    private lateinit var button: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Display name of the Application
        val textView = findViewById<TextView>(R.id.appName)

        // Assigning id of choices and numberInput
        radioGroup = findViewById(R.id.choices)
        var nprints = findViewById<EditText>(R.id.numberInput)

        // Assigning id of "Order Prints" button
        button = findViewById(R.id.button)

        // Actions to be performed when the customer orders the prints
        button.setOnClickListener {

            // Getting the checked radio button id from the radio group (major element)
            val selectedOption: Int = radioGroup!!.checkedRadioButtonId

            //Now, the main part that will make the app work
            if (selectedOption.toString().equals("2131230893"))
            {
                var ans = 0.19 * (nprints.text.toString().toInt())
                result.setText("Youe total cost is $$ans")

            } else if (selectedOption.toString().equals("2131230888")){
                var ans = 0.49 * nprints.text.toString().toInt()
                result.setText("Your total cost is $$ans")

            } else if (selectedOption.toString().equals("2131230873")) {
                var ans = 0.79 * nprints.text.toString().toInt()
                result.setText("Your total cost is $$ans")
            }

            /* We got those 3 numbers from the code in line 42. The toast helped us to find the numerical ID of each button
               to assign it to its correct if statement. The lines below show the toast statement:

             Displaying text of the checked radio button in the form of toast
             Toast.makeText(this, selectedOption.toString()  , Toast.LENGTH_SHORT).show()*/

        }
    }
}
