package com.example.kotlinclassapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.io.IOException

class MainActivity : AppCompatActivity() {
    var globalX =0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        var alex = futbolcu("alex",30,"Brezilya")
        println(alex.isim)
        alex.futbolcuSoyle()
        alex.Ayakkabırengi ="mavi"

        var messi = futbolcu("Messi",34,"Arjantin")
        println(messi.isim)
        messi.futbolcuSoyle()
        messi. Ayakkabırengi = "sarı"
        //messi.forma="a"
        messi.kolUzunlukSet("uzun")
        println(messi.forma)
        println(messi.getUzunluk())

        //inheritance

        val kahraman = Kahraman("superman","uçmak")
        kahraman.kos()

        val muhtesemKahraman = MuhtesemKahraman("batman","zeng")
        muhtesemKahraman.kos()
        println(muhtesemKahraman.isim)
        muhtesemKahraman.isim = "asa"
        muhtesemKahraman.muhtesemFonksiyon()

        //Polymorphism
        //Static Polymorphism
        val islemler = Islemler()
        println(islemler.cikarma(10,2))
        println(islemler.cikarma(10,2,3))
        println(islemler.cikarma(10,2,3,2))

        //Dynamic polymorphism
        val nesne1 = nesne()
        val obje1 = obje()
        var ornekDizi = arrayOf(nesne1,obje1)
        ornekDizi.forEach {
            it.nesneHareketEtti()
        }

        //Abstraction
        //Abstract Class , Interface  soyut yapı arayüz

        println(islemler.testFunc())
        println(islemler.testFuncInterface())


        //Lambda
        println("----Lambda-----")
        yazdigimiYazdir("Selim")

        val yazdigimiYazdirLambda = {verilenString: String-> println(verilenString)}
        yazdigimiYazdirLambda("yazdir test")

        val carpmaİslemiLambda = {a:Int,b:Int ->a*b}
        val sonuc = carpmaİslemiLambda(3,4)
        println(sonuc)

        val carpmaIkınciVersiyon :(Int,Int)->Int = {a,b->a*b}
        println(carpmaIkınciVersiyon(5,5))


        // high order functions

        //Filter
        val benimListem = arrayListOf(1,3,5,7,9,11,13,15,17,19)

        val kucukSayilarListesi = benimListem.filter {
            num -> num <10
        }
        val kucukSayilarListesi1 = benimListem.filter {
               it<10
        }
        for (numara in kucukSayilarListesi){
            println(numara)
        }

        var bosListe = arrayListOf<Int>()
        val kucukSayilarYeniListesi = benimListem.filter {
            it<10
        }

        //Map
        val karesiAlinmisSayilar=benimListem.map { it*it }
        for (numara in karesiAlinmisSayilar){
            println(numara)
        }

        // Map & filter
        val mapFilterBirArada = benimListem.filter {
            it <10
        }.map { it*it }
        mapFilterBirArada.forEach { println(it) }

        val futbolcuArda = futbolcu("Arda Güler",19,"Türkiye")
        val futbolcuYamal = futbolcu("Lamine Yamal",17,"İspanya")
        val futbolcuKenan = futbolcu("Kenan Yıldız",21 ,"Türkiye")
        val futbolcuDoue = futbolcu("Desire Doue",20,"Fransa")
        val futbolcuVini = futbolcu("Vinicius Junior",24,"Brezilya")
        val futbolcuSelim = futbolcu("Selim Ilgaz",29 ,"Türkiye")
        val futbolcuKıvanç = futbolcu("Kıvanç Kuçükkarış",31,"Türkiye")

        val futbolcular = arrayListOf<futbolcu>(futbolcuArda,futbolcuKenan,futbolcuDoue,futbolcuVini,futbolcuYamal,futbolcuSelim,futbolcuKıvanç)

        val yirmidenBuyukFutbolcularınUlkeleri=futbolcular.filter { it.yas>20 }.map { it.ulke }
        yirmidenBuyukFutbolcularınUlkeleri.forEach {
            println(it)
        }
        val yirmiİkidenKucukFutbolcularınİsimleri= futbolcular.filter { it.yas<22 }.map { it.isim }
        yirmiİkidenKucukFutbolcularınİsimleri.forEach {
            println(it)
        }


        //Scope Fonksiyonları
        println("-------Scope Fonksiyonları--------")
        var benimInteger : Int? = null
        benimInteger=5
        benimInteger?.let {
            println(it)
        }

        val yeniInteger = benimInteger?.let { it+1 } ?:0
        println(yeniInteger)


        //also şuda buda bunu yap
        futbolcular.filter {
            it.yas<35
        }
            .also {
                it.forEach {
                    println(it.isim)
                }
            }



        //Try -Catch  hataları ele almak

        val sonucInt = intOrNullFonksiyon("50")
        val sonucNull = intOrNullFonksiyon("Selim")

        println(sonucInt)
        println(sonucNull)


        //Breakpoint kırmızı çizgi düğme step
        println(globalX)
        ornekFonksiyon2()
        ornekFonksiyon()

    }
    fun intOrNullFonksiyon(str: String): Int?{
        try {
            val numara = str.toInt()
            return numara
        }
        catch (e: IOException){
            e.printStackTrace()
        }
        catch (e: NumberFormatException){
            e.printStackTrace()
        }
        catch (e: Exception){
            e.printStackTrace()
        }
        return null
    }


    fun yazdigimiYazdir(string: String){
        println(string)
    }

    fun ornekFonksiyon(){
        globalX=20
        println(globalX)
    }
    fun ornekFonksiyon2(){
        globalX = 30
        println(globalX)
    }

}