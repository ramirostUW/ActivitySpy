package edu.washington.activityspy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.util.Log

class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toast = Toast.makeText(applicationContext, "Greetings, UW!", Toast.LENGTH_LONG)
        toast.show()

        Log.i(TAG, "OnCreate event fired")
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "OnStart event fired")
    }
    override fun onResume() {
        super.onResume()
        Log.i(TAG, "OnResume event fired")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "OnPause event fired")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "OnStop event fired")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "OnDestroy event fired")
        Log.e(TAG, "We're going down, Captain!")
    }
}