

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
   git clone https://github.com/SELIMCNR/KotlinClassApp.git
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

---

# 📱 Kotlin Mobile Application

This project is a **mobile application** developed using **Kotlin**, which includes the concepts of **object-oriented programming (OOP)** and **functional programming**. This project, which does not contain any design elements, was created to practice the basic structures of Kotlin such as **inheritance, polymorphism, abstraction, lambda expressions** and **scope functions**.

## 🚀 Features

- **Object-oriented structures are created with the use of **classes and constructors**.
- **Polymorphism**: There are both **static** and **dynamic** polymorphism examples.
- Abstract class and interface logic is implemented with the use of **Abstraction & Interface**.
- **Lambda expressions** and **High-order functions** are used.
- Optimized data processing processes with **Scope functions** (`let`, `also`).

- Secure code flow is provided with **Try-Catch error management** mechanism.

## 🔧 Installation

1. **Clone the project**:
```bash
git clone https://github.com/SELIMCNR/KotlinClassApp.git
```

2. **Open with Android Studio** and examine the `MainActivity.kt` file.

3. **Run the application**:

- You can run it on an emulator or a physical device.

## 🏗️ Technologies Used

- **Language:** Kotlin
- **IDE:** Android Studio
- **Mobile Platform:** Android (non-design)

## 📂 File Structure

```
/project_name
│── /app
│ ├── /src/main/java/com/example/kotlinclassapp
│ │ ├── MainActivity.kt
│ │ ├── futbol.kt
│ │ ├── Kahraman.kt
│ │ ├── MuhtesemKahraman.kt
│ │ ├── Islemler.kt
│ │ ├── object.kt
│ │ ├── object.kt
│ ├── /src/main/res
│── README.md
│── build.gradle
```

## 📝 Sample Code

### 🔹 **Class and Constructor Examples**
```kotlin
class footballer(val name: String, val age: Int, val country: String) {
var Shoecolor: String = ""

fun footballerSay() {
println("$name footballer and country: $country")
}
}
```
```kotlin
val footballer1 = footballer("Arda Güler", 19, "Turkey")
println(footballplayer1.name)
footballplayer1.soccerplayerSay()
```

### 🔹 **Polymorphism**
```kotlin
class Operations {
fun subtraction(a: Int, b: Int) = a - b
fun subtraction(a: Int, b: Int, c: Int) = a - b - c
}
```
```kotlin
val operations = Operations()
println(operations.subtraction(10,2))
println(operations.subtraction(10,2,3))
```

### 🔹 **Lambda Expressions**
```kotlin
val multiplicationLambda = { a: Int, b: Int -> a * b }
val result = multiplicationOperationLambda(3,4)
println(result)
```

### 🔹 **Scope Functions (`let`, `also`)**
```kotlin
var myInteger: Int? = null
myInteger = 5
myInteger?.let { println(it) }
```
```kotlin
footballers.filter { it.age < 35 }
.also { it.forEach { println(it.name) } }
```

### 🔹 **Error Handling (Try-Catch)**
```kotlin
fun intOrNullFunction(str: String): Int? {
try {
return str.toInt()
} catch (e: NumberFormatException) {
e.printStackTrace()
}
return null
}
```

## 📌 Contribution

- You can make improvements by getting a **Fork**.
- You can share your suggestions by opening a `Pull Request`.

---

