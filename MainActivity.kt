package com.murataliavcu.farklaktiviteekranlar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

fun degistir (view: View){

    val verigirdisi=textview1.text.toString()


    val intent = Intent(applicationContext,ikinicekran::class.java)
    
intent.putExtra("girilenveri",verigirdisi)
    startActivity(intent)

}



}