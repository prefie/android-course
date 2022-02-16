package com.example.android_course

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    companion object {
        const val SQUARE_KEY = "SQUARE_KEY"
    }

    private var square: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val message = intent.getStringExtra(EXTRA_MESSAGE)
        square = message?.toInt() ?: 0

        findViewById<TextView>(R.id.textView).apply {
            text = message
        }

        Log.i("SecondActivity", "onCreate")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        outState.putInt(SQUARE_KEY, square)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)

        square = savedInstanceState.getInt(SQUARE_KEY)
    }

    override fun onStart() {
        super.onStart()
        Log.i("SecondActivity", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("SecondActivity", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("SecondActivity", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("SecondActivity", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("SecondActivity", "onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("SecondActivity", "onRestart")
    }
}