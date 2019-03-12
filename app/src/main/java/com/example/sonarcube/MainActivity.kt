package com.example.sonarcube

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val appClass = AppClass()
        appClass.sum(2,4)

        // val dataClass = DataClass()
        // appClass.sum(2,4)
    }
}
