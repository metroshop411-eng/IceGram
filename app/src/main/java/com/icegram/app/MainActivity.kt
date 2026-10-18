package com.icegram.app

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.widget.TextView
import android.view.Gravity

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val textView = TextView(this).apply {
            text = "IceGram"
            textSize = 28f
            setTextColor(Color.WHITE)
            gravity = Gravity.CENTER
        }
        setContentView(textView)
        window.decorView.setBackgroundColor(Color.parseColor("#121212"))
    }
}
