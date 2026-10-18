package com.icegram.app

import android.app.Activity
import android.os.Bundle
import android.widget.TextView
import android.widget.LinearLayout
import android.graphics.Color
import android.view.Gravity

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        try {
            val layout = LinearLayout(this).apply {
                orientation = LinearLayout.VERTICAL
                gravity = Gravity.CENTER
                setBackgroundColor(Color.parseColor("#121212"))
            }

            val textView = TextView(this).apply {
                text = "IceGram Client\n(Антиудаление в разработке)"
                setTextColor(Color.WHITE)
                textSize = 24f
                gravity = Gravity.CENTER
            }

            layout.addView(textView)
            setContentView(layout)
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}
