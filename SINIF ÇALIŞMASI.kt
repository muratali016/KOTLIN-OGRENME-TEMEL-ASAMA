package com.murataliavcu.siniflar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
  sınıflar()

var sayı:Int?=null //değer almazsa null yazdırır.

 //sayı =2
        if (sayı !=null){
            println("veri tabanından çekilen veri= ${sayı}")

        }else {
            println("null girdisi var !!!")
        }

//ikinci null yöntem asağıda
        println(sayı!!.minus(2)) //!! koyarsan null olmayacağı kesindir
        //? koyarsan null olabilir !!!

//elvis operatörü
        val sonuc =sayı?.minus(2) ?: 10 //null değilse ? ın yanındakini yazdırır.
        println(sonuc)
//let operatorü null değilse burası da çalışır
        sayı.let {
            println(it+5)
        }

    }


    fun sınıflar(){
  //ALTTAKİ FONKSİYON CONSTRUCTOR OLMADAN YAZILAN FONKSİYONDUR ---------------------------------
       /* var Atmacafüzesi=FÜZELER()
        Atmacafüzesi.isim="FÜZE1"
        Atmacafüzesi.menzil="10000 km "
        Atmacafüzesi.menşei="Türk"
        textView.text=("Atmacafüzesimenzili ${Atmacafüzesi.menzil}")
*/
     //CONSTRUCTORLI YAZILAN FONKSİYON

      var cirit=FÜZELER("cirit","10km","TR")
        println("ciritin menzili ${cirit.menzil}")

    }

//NULL DEĞERLERİ=TANIMLADIĞIMIZ BİR DEĞİŞKENİN TAM DEĞERİ KESİN DEĞİLSE NULL İLE TERBİYE EDEBİLİRİZ.




    }


