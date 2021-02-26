package com.murataliavcu.sqlite_ogrenme

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.FileObserver.CREATE

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
   try {

       val veritabanı =this.openOrCreateDatabase("urunler", Context.MODE_PRIVATE,null)
       veritabanı.execSQL("CREATE TABLE IF NOT EXISTS urunler (id INTEGER PRIMARY KEY,isim  VARCHAR ,fiyat INT) ")

       veritabanı.execSQL("INSERT INTO urunler (isim,fiyat) VALUES ('tişört',10)")
 veritabanı.execSQL("INSERT INTO urunler (isim,fiyat) VALUES ('Ayakkabı',100)")

      //val cursor =veritabanı.rawQuery("SELECT * FROM urunler WHERE isim='Ayakkabı'  ",null)
       val cursor =veritabanı.rawQuery("SELECT*FROM urunler",null)
      // val cursor =veritabanı.rawQuery("SELECT * FROM urunler WHERE isim LIKE 'A'",null)
       //başharfi a olanlar

       veritabanı.execSQL("UPDATE urunler SET fiyat =250 WHERE isim ='Ayakkabı' ")
       veritabanı.execSQL("DELETE FROM urunler WHERE id=5")//id 5 olan silinir
         val idColumnindex =cursor.getColumnIndex("id")
       val isimColumindex=cursor.getColumnIndex("isim")
       val fiyatColumindex=cursor.getColumnIndex("fiyat")


       while(cursor.moveToNext()){
           println("ID:${cursor.getInt(idColumnindex)}")
           println("ISIM: ${cursor.getString(isimColumindex)}")
           println("fiyat: ${cursor.getInt(fiyatColumindex)}")
       }
       cursor.close()


   }catch (e:Exception){


   }




    }
}