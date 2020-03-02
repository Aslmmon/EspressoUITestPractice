package com.example.espressuitestingpractice.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.findNavController

import com.example.espressuitestingpractice.R
import kotlinx.android.synthetic.main.fragment_first.*
import kotlinx.android.synthetic.main.fragment_first.view.*


class FirstFragment : Fragment(R.layout.fragment_first) {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.btn_goTOSecond.setOnClickListener {
            var bundle = bundleOf("text" to "eshta 3lek")
            it.findNavController().navigate(R.id.goToSecondFragment,bundle)
        }
    }
}
