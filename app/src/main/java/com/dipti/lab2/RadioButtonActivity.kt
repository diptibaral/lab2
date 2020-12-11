package com.dipti.lab2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.TextView

class RadioButtonActivity : AppCompatActivity() {

    private lateinit var textView: TextView
    private lateinit var male: RadioButton
    private lateinit var female: RadioButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_radio_button)

        textView = findViewById(R.id.textView)
        male= findViewById(R.id.male)
        female = findViewById(R.id.female)

        displayCheck()
    }

    fun displayCheck() {
        male.setOnClickListener {
            if (male.isChecked) {
                println("male")//shows in logcat
                textView.text = male.text.toString()
            }
        }
        female.setOnClickListener {
            if (female.isChecked) {
                println("female")
                textView.text = female.text.toString()
            }
        }
    }


}