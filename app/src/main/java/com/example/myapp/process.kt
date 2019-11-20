package com.example.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

import kotlinx.android.synthetic.main.activity_process.*


class process : AppCompatActivity() {



    private var score = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_process)
        up.setOnClickListener { onPlus() }
        down.setOnClickListener { onDown() }




    }

    private fun onPlus() {
        if (score != -99999) {
            score++
        }
        update()
    }

    private fun onDown() {
        if (score!= -99999) {
            score--
        }
        update()
    }

    private fun update() {
        point.text = score.toString()
        Toast.makeText(this,"clicked", Toast.LENGTH_SHORT).show()
    }
}