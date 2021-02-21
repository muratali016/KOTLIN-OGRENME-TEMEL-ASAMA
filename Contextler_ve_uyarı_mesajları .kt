package com.murataliavcu.contextprojesi

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        Toast.makeText(this, "Uygulamaya hoşgeldiniz", Toast.LENGTH_LONG).show()
    }

    fun mesajgoster(view: View) {
        val mesaj = AlertDialog.Builder(this)
        mesaj.setTitle("virüs tespit edildi !!!")
        mesaj.setMessage("uygulamada virüs tespit edildi.Tarama başlatılsın mı?")
        //Lambda gösterimleri
        mesaj.setPositiveButton("evet", DialogInterface.OnClickListener { dialoginterface, i ->
            Toast.makeText(this, "tarama başladı", Toast.LENGTH_LONG).show()
        })

        mesaj.setNegativeButton("hayır tarama yapılmasın") { dialoginterface, i ->
            Toast.makeText(this, "tarama başlamadı,iptal edildi", Toast.LENGTH_LONG).show()
        }

        mesaj.show()
    }

}


