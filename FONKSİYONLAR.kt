package com.murataliavcu.fonksiyonvesnflar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

cıkarma(2,5)

        //BUTTONUN ONCLİKİNİ SİNİ YAZMAYIUP DİREK ADINI YAZIYORUZ
        button.setOnClickListener{
            val toplamasonucu=toplamaislemidöndürme(10,50)
            textView2.text="sonuç${toplamasonucu}"
        }

        //PARAMETLRELER
  var k=toplamaislemidöndürme(6,5) // ınt değer vererk return yapmak
        println(k)
        textView2.text= "${k} " //ekrana yazdırmak
        }

fun cıkarma(x:Int,y:Int ){
 textView2.text="Sonuç = ${x-y}"  //texyview e atamak

}


    //RETURN İŞLEMİ
    fun toplamaislemidöndürme (a:Int,b:Int) :Int{

        return a+b
    }
/*
//buton atamak ve textview da göstermek !RETURN FONKSİYONUNA BAĞLAMAN LAZIM
    fun butonudegistir (view:View){
 val toplamasonucu=toplamaislemidöndürme(10,50)
    textView2.text="sonuç${toplamasonucu}"
   }
*/ //ÜSTTEKİ FONKSİYONUIN AYNISI ONCREATE DE BUTTON SET ON CLİCKER OLARAK YAZILABİLR





        }

