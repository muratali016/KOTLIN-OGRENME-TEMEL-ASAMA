package com.murataliavcu.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("merhaba")
        //DEĞİŞKENLER VE SABİTLER  // INT DEĞERLERİ----------------------------------------------
        var a = 1
        var b= 2
        println(a*b)
        val x= 3 //sabit metodu
        val y=4
        println(x+y)
        //TANIMLAMA--------------------------------------------------------------
        val benimintim: Int

        benimintim= 5

        //LONGLAR-------------------------------------------------------------
        var benimlog: Long =132143253245
        println(benimlog)

        //DOUBLE VE FLOATLAR--------------------------------------------------
        val pi =3.14
        println(pi+200)
        val floatPi: Float=3.14f
        println(floatPi*2)

         //STRİNGLER---------------------------------------------------------
        val benimString="Yeni string metni"
        println(benimString.length)
        benimString.length //uznunluk
        val string1:String
        string1="10"
        val string2:String
        string2="20"
        println(string1+string2)

        //BOOLEANLAR------------------------------------------------------------------
         var benimBoolean=true
        println(3>5)

        //VERİ VDÖNÜŞTÜRME-------------------------------------------------------------
        val int=10

        val lonolanint=int.toLong()
        //örnek
        var kullanıcıgirdisi="50"
        kullanıcıgirdisi.toInt() // artık string veriyi int olup hesap yapılabilir.
        println(kullanıcıgirdisi+2)


        //KOLEKSİYONLAR-----------------------------------------

         //ARRAY DİZİLER+++++++++++++++++++++++
        val benimDizi= arrayOf("murat","ali","avcu",1,true)
        println (benimDizi[0])  //eleman çağırma
        println (benimDizi.get(0))
        benimDizi[1]="mehemt" //eleman değişti
        benimDizi.set(0,"eşek")

        val numaradizisi= doubleArrayOf(1.0,2.0) //belli değerlerle array oluşturma

        //ARRAY LİSTELER+++++++++++++++++++++++
        val isimListesi= arrayListOf<String>("murat","ali") //String i "Any" çevirirsen istediğin türü verirsin.
        isimListesi.add("avcu") //eleman ekleme
        println(isimListesi)
        println(isimListesi[0])

        val anylistesimuadili=ArrayList<Int>() //eleman ekleme metodu.
        anylistesimuadili.add(2)
        anylistesimuadili.add(5)
          println(anylistesimuadili)

        //SET LİSTELERİ----------------------------------------------------
        val ornekdizi= arrayOf(5,6,6,7)
        println("1.eleman ${ornekdizi[0]} ")
         ornekdizi.size
        val ornekset= setOf<Int>(1,2,2,3,3,4)
        println(ornekset.size) //aynı elemanları 1 eleman sayar.

val foricinset=HashSet<String>()
        foricinset.add("murat ")
        foricinset.add("murat ")
        foricinset.add("ali ")

        // DÖNGÜ İÇİNDE DÖNÜP DURUP SADECE 1 KERE MURAT YAZAR
        foricinset.forEach{

            println(it)
        }
     // MAP YAPILARI---------------------------------------------------------------------
        val yemekdizisi= arrayOf("elma ","Armut")
        val kaloridizidi= arrayOf(100,200)
        println("${yemekdizisi[0]} kalorisi ${kaloridizidi[0]} dır ") //KÖTÜ YÖNTEM


        //MAO YAPISI İLE KEY- VALUE EŞLEŞTİRMESİ---------------------------------------------------------
        val yemeklistesi=HashMap<String,Int>()
        yemeklistesi.put("kırmnızı et",1500)
        yemeklistesi.put("tavuk",500)
        println(yemeklistesi.get("kırmnızı et"))

        //MATEMNATİKSEL İŞLEMLER-----------------------------------------------------------------------------------
        println(2<3 && 5>4) //"ve" işlemi
        println(2<6 && 5>6) //veya işlemi KOYULACAK
        println(11%3) //kalanı bulma işlemi sonuç 2 gelir



        //IF KONTROLLERİ------------------------------------------------------------------------------
        val Testdaf_Puanı =20
        if(Testdaf_Puanı<13){
println("Maalesef testdafı geçemediniz")

    }
else if (Testdaf_Puanı>=13 && Testdaf_Puanı<16){
    println("Tebrikler lisansa geçmeye hak kazandınız")

        }
else if (Testdaf_Puanı>=16 && Testdaf_Puanı<20){
    println("Tebrikler Tdn4 belgesini yüksek başarı ile aldınız")
        }
else if (Testdaf_Puanı==20){
    println("Tdn 5 belgesi ile c1 olduğunuz ispatladınız")
        }

    //WHEN KONTROLLERİ---------------------------------------------------------------------
     var not = 5
     var notstringi =""
     when(not){
         1->notstringi="kötü"
         2->notstringi="kalır"
         3->notstringi="orta kötü"
         4->notstringi="orta iyi"
         else -> notstringi="gayet güzel" //1,2,3,4 dışında bir rakam girersen bunu yazdırır.
     }
println(notstringi)

        //FOR DÖNGÜLERİ-------------------------------------------------------
        val sayıdizisi = arrayOf(1,2,3,4,5,6)


        for (numara in sayıdizisi){     //indeksle çok farkı yok
            println(numara+1)
        }
        for(indeksmetodu in sayıdizisi.indices){   //tek tek indekslerini (elemanları ) alır
            println(sayıdizisi[indeksmetodu]/5+1)
        }

   val stringdizsi= arrayListOf<String>()  //STRİNG DİZİSİNDEN ELEMAN YAZDIRMA
        stringdizsi.add("Murat")
        stringdizsi.add("Ali")
        for (str in stringdizsi){
            println(str)
        }


        //WHİLE DÖNGÜSÜ------------------------------------------------------------------------

        var c= 5
        while (c<100000){  //100000 olana kadar yazdırmaya devam edicektir
            c=c+1
            println(c)

        }


    }





}