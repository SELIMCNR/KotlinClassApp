package com.example.kotlinclassapp

import android.util.ArrayMap
import androidx.collection.arrayMapOf

class futbolcu (var isim:String,var yas:Int,var ulke:String){

    fun futbolcuSoyle(){
        println("Futbolcu adı ${this.isim} yaşı : ${this.yas},ulkesi : ${this.ulke}")
    }

    var Ayakkabırengi =""
    //encapsulation
    var forma = "good"
        private set
        public get
    private var kolUzunluk = ""
    fun kolUzunlukSet(yenikolUzunluk:String){
        this.kolUzunluk = yenikolUzunluk
    }
    fun getUzunluk(): String {
       return this.kolUzunluk
    }
    fun formaYazdir(){
        println(this.forma)
    }



    init{
        println("Otomatik çalışacak fonksiyon.")
    }
}