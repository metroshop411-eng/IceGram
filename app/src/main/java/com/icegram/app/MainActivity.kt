package com.icegram.app

import android.os.Bundle
import android.widget.TextView
import android.graphics.Color
import android.view.Gravity
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        val layout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER
            setBackgroundColor(Color.parseColor("#121212"))
        }

        val textView = TextView(this).apply {
            text = "IceGram Client"
            setTextColor(Color.WHITE)
            textSize = 24f
            gravity = Gravity.CENTER
        }

        layout.addView(textView)
        setContentView(layout)
    }
}
