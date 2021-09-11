package com.example.patikadev

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.patikadev.utils.startActivity
import java.util.*


class SplashActivity : AppCompatActivity() {
    private val DELAY  :  Long = 3 * 1000
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        //start test activity after delay
        Timer().schedule(object : TimerTask() {
            override fun run() {
                startActivity<TestActivity>()
                finish()
            }
        }, DELAY)
    }
}