package com.example.espressuitestingpractice.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.espressuitestingpractice.R
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity(R.layout.activity_second) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        btn_back.setOnClickListener {
            onBackPressed()
        }
    }
}
