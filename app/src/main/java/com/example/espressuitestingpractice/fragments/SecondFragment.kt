package com.example.espressuitestingpractice.fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.espressuitestingpractice.R
import kotlinx.android.synthetic.main.fragment_second.*

/**
 * A simple [Fragment] subclass.
 */
class SecondFragment : Fragment(R.layout.fragment_second) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val texTGot  = arguments?.getString("text")
        Log.i(javaClass.simpleName,texTGot)
        tv_data_recieved.text = texTGot
    }
}
