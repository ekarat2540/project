package com.example.myapp

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.myapp.databinding.ActivityProcessBinding

import kotlinx.android.synthetic.main.activity_process.*


class process : AppCompatActivity() {
    private lateinit var binding:ActivityProcessBinding

    private var myName:MyName = MyName("")

    private var score = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = DataBindingUtil.setContentView(this,R.layout.activity_process)
       // setContentView(R.layout.activity_process)


        up.setOnClickListener { onPlus() }
        down.setOnClickListener { onDown() }
        binding.apply{
            doneButton.setOnClickListener{
                date(it)
            }
            dateText.setOnClickListener{
                updateDate(it)
            }
        }
        binding.myName =  myName



    }
    private fun updateDate(view: View){
        binding.apply {
            dateEdit.visibility = View.VISIBLE
            dateText.visibility = View.GONE

            doneButton.visibility = View.VISIBLE

            dateEdit.requestFocus()
            val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.showSoftInput(dateEdit,0)
        }

    }
    private fun date(view: View){
        binding.apply {
            myName?.dateQ = dateEdit.text.toString()
            dateEdit.visibility = View.GONE
            dateText.visibility = View.VISIBLE


            doneButton.visibility = View.GONE
            invalidateAll()
//hide the keyboard
            val inputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            inputMethodManager.hideSoftInputFromWindow(view.windowToken,0)
        }


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