package com.example.patikadev.utils

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager

inline fun<reified T : AppCompatActivity> Context.startActivity(block : Intent.() -> Unit = {}){

    val intent  = Intent(this , T::class.java)
    startActivity(
        intent.also {
            block.invoke(it)
        }
    )
}

fun Context.replaceFragment(fragment: Fragment,frameId: Int,supportFragmentManager: FragmentManager){
    supportFragmentManager.beginTransaction().replace(frameId,fragment).commit()
}

