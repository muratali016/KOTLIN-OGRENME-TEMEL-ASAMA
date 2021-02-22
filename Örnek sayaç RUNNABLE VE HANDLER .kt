package com.murataliavcu.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
   var numara =0
var handler =Handler()
    var runnable:Runnable = Runnable {  }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

fun baslat (view: View){

runnable =object:Runnable{
    override fun run() {
        numara=numara+1
        textView.text="100 e kadar sayım${numara}"
        handler.postDelayed(runnable,1000)

    }

}

handler.post(runnable)
}

    fun durdur (view:View){

handler.removeCallbacks(runnable   )
 numara=0
        textView.text="sıfırlandı"
    }


}