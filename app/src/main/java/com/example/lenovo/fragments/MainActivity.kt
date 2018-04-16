package com.example.lenovo.fragments

import android.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        loadFragment(Screen())
    }
    fun loadFragment(frag:android.support.v4.app.Fragment){
        val tns=supportFragmentManager.beginTransaction()
        tns.replace(R.id.frameLayout5,frag)
        tns.commit()
    }
}
