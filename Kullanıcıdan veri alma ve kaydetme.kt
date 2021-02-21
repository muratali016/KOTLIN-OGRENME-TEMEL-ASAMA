package com.murataliavcu.kullanc_veri_saklama

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var veri:SharedPreferences
var alınanisim:SharedPreferences? =null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

   veri=getSharedPreferences(" com.murataliavcu.kullanc_veri_saklama"
   , Context.MODE_PRIVATE)


    }

fun sil (view: View){

    


}
  fun kaydet (view:View){

      val ad =editText.text.toString()

      if(ad==""){
          Toast.makeText(this,"isminizi giriniz",
                  Toast.LENGTH_LONG).show()
      }else{
veri.edit().putString("isim",ad).apply()
          textView3.text="kaydedilen değer= ${ad}"
      }
  }


}