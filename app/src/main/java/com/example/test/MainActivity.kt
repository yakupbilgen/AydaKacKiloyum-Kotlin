package com.example.test

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnTopla.setOnClickListener{
            var sayi1=txtSayi1.text.toString().toInt()
            var sayi2=txtSayi2.text.toString().toInt()
            var sonuc=sayi1+sayi2
            lblSonuc.text="Sonuc: $sonuc"
        }
        btnCikar.setOnClickListener{
            var sayi1=txtSayi1.text.toString().toInt()
            var sayi2=txtSayi2.text.toString().toInt()
            var sonuc=sayi1-sayi2
            lblSonuc.text="Sonuc: $sonuc"
        }
        btnCarp.setOnClickListener{
            var sayi1=txtSayi1.text.toString().toInt()
            var sayi2=txtSayi2.text.toString().toInt()
            var sonuc=sayi1*sayi2
            lblSonuc.text="Sonuc: $sonuc"

        }
        btnBol.setOnClickListener{
            var sayi1=txtSayi1.text.toString().toInt()
            var sayi2=txtSayi2.text.toString().toInt()
            var sonuc=sayi1/sayi2
            lblSonuc.text="Sonuc: $sonuc"
        }


        }




    }

