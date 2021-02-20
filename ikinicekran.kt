package com.murataliavcu.farklaktiviteekranlar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_ikinicekran.*

class ikinicekran : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ikinicekran)

        val intent =intent
        val veri =intent.getStringExtra("girilenveri")

        ikincimetin.text =veri

    }


}