package com.dipti.lab2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {


        private lateinit var textView: TextView
        private lateinit var button: Button
        var count = 0
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            textView = findViewById(R.id.textView)
            button = findViewById(R.id.button2)

            button.setOnClickListener {
                count = count + 1
                showCount(count)
            }

        }

        fun showCount(c: Int) {
            textView.setText(c.toString())
        }
    }


