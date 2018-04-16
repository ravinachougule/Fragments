package com.example.lenovo.fragments


import android.app.Activity
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import kotlinx.android.synthetic.main.fragment_button.*


/**
 * A simple [Fragment] subclass.
 */
class ButtonFrag : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val vw= inflater.inflate(R.layout.fragment_button, container, false)
        vw.findViewById<Button>(R.id.btnMouse).setOnClickListener{
            (activity as MainActivity).loadFragment(MouseFrag())
        }
        vw.findViewById<Button>(R.id.btnScreen).setOnClickListener{
            (activity as MainActivity).loadFragment(Screen())
        }
        vw.findViewById<Button>(R.id.btnKeyboard).setOnClickListener{
            (activity as MainActivity).loadFragment(Keyboard())
        }

        return vw
    }

}// Required empty public constructor
