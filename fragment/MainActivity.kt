package com.murataliavcu.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.FragmentManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun Blankfragment1 (view: View){

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()

        val firstFragment = BlankFragment1()
        fragmentTransaction.replace(R.id.frameLayout,firstFragment).commit()

    }



    fun Blankfragment2  (view: View){

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()

        val firstFragment = BlankFragment1()
        fragmentTransaction.replace(R.id.frameLayout,firstFragment).commit()

    }

}