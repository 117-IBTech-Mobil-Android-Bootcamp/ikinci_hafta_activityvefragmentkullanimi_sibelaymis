package com.example.patikadev

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.patikadev.fragments.FirstTestFragment
import com.example.patikadev.utils.replaceFragment

class TestActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)
        //replace fragment
        replaceFragment(FirstTestFragment(),R.id.testFragmentContainer,supportFragmentManager)
    }
}