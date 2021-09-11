package com.example.patikadev.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.patikadev.R
import com.example.patikadev.utils.replaceFragment
import kotlinx.android.synthetic.main.fragment_first_test.*


class FirstTestFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view = inflater.inflate(R.layout.fragment_first_test, container, false)


        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        startNowButton.setOnClickListener {
            //Set arguments for word test inputs
            val cardList = arrayOf<String>("Görselleştirmek", "Altında", "Bağış", "Ensülin")
            val question = "Visualize"
            var wordTestFragment = WordTestFragment().apply {
                arguments = Bundle().apply {
                    putStringArray("cardList", cardList)
                    putString("question", question)
                }
            }
            //replace fragment
            requireActivity().replaceFragment(
                wordTestFragment,
                R.id.testFragmentContainer,
                requireActivity().supportFragmentManager
            )
        }
    }

}