package com.example.espressuitestingpractice.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.espressuitestingpractice.CameraIntentActivity
import com.example.espressuitestingpractice.ImageIntentActivity
import com.example.espressuitestingpractice.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        btn_next.setOnClickListener {
            startActivity(Intent(this,
                SecondActivity::class.java))

        }
        btn_goToThird.setOnClickListener {
            startActivity(Intent(this,
                ThirdActivity::class.java))
        }
        btn_test_intent.setOnClickListener {
            startActivity(Intent(this,
                ImageIntentActivity::class.java))
        }
        btn_test_intent_camera.setOnClickListener {
            startActivity(Intent(this,
                CameraIntentActivity::class.java))
        }
    }
}
