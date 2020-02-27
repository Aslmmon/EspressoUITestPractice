package com.example.espressuitestingpractice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        btn_next.setOnClickListener {
            startActivity(Intent(this,SecondActivity::class.java))
        }
        btn_goToThird.setOnClickListener {
            startActivity(Intent(this,ThirdActivity::class.java))

        }
    }
}
