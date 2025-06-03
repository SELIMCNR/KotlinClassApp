Senin için kod yapısına uygun, **sınıflar**, **constructorlar**, **polymorphism**, **abstraction**, **lambda** ve **scope fonksiyonları** gibi Kotlin konularını içeren yeni bir README dosyası oluşturdum:

---

# 📱 Kotlin Mobil Uygulama 

Bu proje, **Kotlin** kullanılarak geliştirilmiş, **nesne yönelimli programlama (OOP)** ve **fonksiyonel programlama** kavramlarını içeren bir **mobil uygulamadır**. Tasarımsal öğeler içermeyen bu proje, **inheritance (kalıtım), polymorphism (çok biçimlilik), abstraction (soyutlama), lambda ifadeleri** ve **scope fonksiyonları** gibi Kotlin’in temel yapılarını pratik etmek için oluşturulmuştur.

## 🚀 Özellikler

- **Sınıflar ve constructor kullanımı** ile nesne tabanlı yapılar oluşturulmuştur.
- **Polymorphism (çok biçimlilik)**: Hem **statik** hem **dinamik** polymorphism örnekleri bulunmaktadır.
- **Abstraction & Interface** kullanımıyla soyut sınıf ve arayüz mantığı uygulanmıştır.
- **Lambda ifadeleri** ve **High-order fonksiyonlar** kullanılmıştır.
- **Scope fonksiyonları** (`let`, `also`) ile veri işleme süreçleri optimize edilmiştir.
- **Try-Catch hata yönetimi** mekanizması ile güvenli kod akışı sağlanmıştır.

## 🔧 Kurulum 

1. **Projeyi klonlayın**:
   ```bash
   git clone [https://github.com/SELIMCNR/KotlinClassApp.git]
   ```

2. **Android Studio ile açın** ve `MainActivity.kt` dosyasını inceleyin.

3. **Uygulamayı çalıştırın**:
   - Emülatör veya fiziksel cihazda çalıştırabilirsiniz.

## 🏗️ Kullanılan Teknolojiler

- **Dil:** Kotlin
- **IDE:** Android Studio
- **Mobil Platform:** Android (tasarım içermeyen)

## 📂 Dosya Yapısı

```
/proje_adı
│── /app
│    ├── /src/main/java/com/example/kotlinclassapp
│    │   ├── MainActivity.kt
│    │   ├── futbolcu.kt
│    │   ├── Kahraman.kt
│    │   ├── MuhtesemKahraman.kt
│    │   ├── Islemler.kt
│    │   ├── nesne.kt
│    │   ├── obje.kt
│    ├── /src/main/res
│── README.md
│── build.gradle
```

## 📝 Örnek Kod

### 🔹 **Sınıf ve Constructor Örnekleri**
```kotlin
class futbolcu(val isim: String, val yas: Int, val ulke: String) {
    var Ayakkabırengi: String = ""

    fun futbolcuSoyle() {
        println("$isim futbolcu ve ülkesi: $ulke")
    }
}
```
```kotlin
val futbolcu1 = futbolcu("Arda Güler", 19, "Türkiye")
println(futbolcu1.isim)
futbolcu1.futbolcuSoyle()
```

### 🔹 **Polymorphism**
```kotlin
class Islemler {
    fun cikarma(a: Int, b: Int) = a - b
    fun cikarma(a: Int, b: Int, c: Int) = a - b - c
}
```
```kotlin
val islemler = Islemler()
println(islemler.cikarma(10,2))
println(islemler.cikarma(10,2,3))
```

### 🔹 **Lambda İfadeleri**
```kotlin
val carpmaİslemiLambda = { a: Int, b: Int -> a * b }
val sonuc = carpmaİslemiLambda(3,4)
println(sonuc)
```

### 🔹 **Scope Fonksiyonları (`let`, `also`)**
```kotlin
var benimInteger: Int? = null
benimInteger = 5
benimInteger?.let { println(it) }
```
```kotlin
futbolcular.filter { it.yas < 35 }
    .also { it.forEach { println(it.isim) } }
```

### 🔹 **Hata Yönetimi (Try-Catch)**
```kotlin
fun intOrNullFonksiyon(str: String): Int? {
    try {
        return str.toInt()
    } catch (e: NumberFormatException) {
        e.printStackTrace()
    }
    return null
}
```

## 📌 Katkıda Bulunma

- **Fork** alarak geliştirmeler yapabilirsiniz.
- `Pull Request` açarak önerilerinizi paylaşabilirsiniz.

---

