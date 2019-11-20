package com.example.myapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import timber.log.Timber


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        startButton.setOnClickListener{
            val intent = Intent(this,process::class.java)
            startActivity(intent)
        }

        listButton.setOnClickListener{
            val intent = Intent(this,save::class.java)
            startActivity(intent)
        }

        averageButton.setOnClickListener{
            val intent = Intent(this,about::class.java)
            startActivity(intent)
        }

        Log.i("MainActivity","onCreate Called")
        Timber.i("onCreate Called")





    }
    override fun onStart(){
        super.onStart()
        Log.i("MainActivity","onStart Called")
        Timber.i("onStart Called")
    }

    override fun onResume(){
        super.onResume()
        Log.i("MainActivity","onResume Called")
        Timber.i("onResume Called")
    }
    override fun onPause(){
        super.onPause()
        Log.i("MainActivity","onPause Called")
        Timber.i("onStart Called")
    }
    override fun onStop(){
        super.onStop()
        Log.i("MainActivity","onStop Called")

        Timber.i("onStop Called")
    }
    override fun onDestroy(){
        super.onDestroy()
        Log.i("MainActivity","onDestroy Called")
        Timber.i("onStart Called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("MainActivity","onRestart Called")
        Timber.i("onRestart Called")
    }
}
