package com.svg.bug

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener {
            changeSize(icon1)
            changeSize(icon2)
            changeSize(icon3)
            changeSize(icon4)
            changeSize(icon5)
            changeSize(icon6)
            layout.requestLayout()
        }
    }

    private fun changeSize(view: View){
        val size = baseContext.dpToPx(Random.nextInt(10,20).toFloat())
        view.layoutParams.width = size
        view.layoutParams.height = size

    }
}
