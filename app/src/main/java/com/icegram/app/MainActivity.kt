package com.icegram.app

import android.app.Activity
import android.os.Bundle
import android.widget.TextView
import android.view.ViewGroup
import android.graphics.Color
import android.widget.FrameLayout

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        val frameLayout = FrameLayout(this).apply {
            layoutParams = ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
            )
            setBackgroundColor(Color.parseColor("#121212"))
        }

        val textView = TextView(this).apply {
            text = "IceGram Client"
            setTextColor(Color.WHITE)
            textSize = 28f
            layoutParams = FrameLayout.LayoutParams(
                FrameLayout.LayoutParams.WRAP_CONTENT,
                FrameLayout.LayoutParams.WRAP_CONTENT
            ).apply {
                gravity = android.view.Gravity.CENTER
            }
        }

        frameLayout.addView(textView)
        setContentView(frameLayout)
    }
}
