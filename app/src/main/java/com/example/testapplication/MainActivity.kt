package com.example.testapplication

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.myTextView)
        val button = findViewById<Button>(R.id.myButton)

        button.setOnClickListener {
            textView.text = "ボタンが押されたよ"
            android.os.Handler(android.os.Looper.getMainLooper()).postDelayed({
                textView.text = "こんにちは"
            }, 3000)
        }
    }
}
