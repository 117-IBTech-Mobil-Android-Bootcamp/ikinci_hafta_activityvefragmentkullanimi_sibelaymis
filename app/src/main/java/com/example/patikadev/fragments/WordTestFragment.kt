package com.example.patikadev.fragments

import android.os.Bundle
import android.os.CountDownTimer
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.patikadev.R
import kotlinx.android.synthetic.main.fragment_word_test.*


class WordTestFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var view=inflater.inflate(R.layout.fragment_word_test, container, false)

        // Inflate the layout for this fragment
        return view

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //Get texts of cards and question
        val cardArrayText=arguments?.getStringArray("cardList")
        txvCard1.text=(cardArrayText?.get(2))
        txvCard2.text=(cardArrayText?.get(1))
        txvCard3.text=(cardArrayText?.get(0))
        txvCard4.text=(cardArrayText?.get(3))
        question_tview.text=(arguments?.getString("question"))
        //set circular progress initial value
        var currentProgress=20
        view_progress_bar.max=currentProgress
        view_progress_bar.progress=currentProgress
        //set timer initial value
        tv_timer.setText("20")
        //start timer and update timer text and progress bar
        val timer = object: CountDownTimer(20*1000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                tv_timer.setText( (millisUntilFinished/1000).toString())
                view_progress_bar.progress = --currentProgress
            }

            override fun onFinish() {

            }
        }.start()
    }
}