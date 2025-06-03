package com.example.kotlinclassapp

class Islemler : testClass(), testInterface {

    fun cikarma(x:Int,y:Int):Int{
        return  x-y
    }
    fun cikarma(x:Int,y:Int,z:Int):Int{
        return x-(y+z)
    }

    fun cikarma(x:Int,y:Int,z:Int,m:Int):Int{
        return  x-(y+z+m)
    }

    override fun testFunc() {
        //abstract arayüz eklendi fonksiyonu
    }

    override fun testFuncInterface() {
        //interface arayüz eklendi fonksiyonu
    }

}