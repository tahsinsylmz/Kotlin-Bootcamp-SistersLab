package com.kotlinegitim.hafta2odev

class Personel(val ad: String, val soyad: String, val pozisyon: String, var maas: Double) {
    fun maasArttir(miktar: Double) {
        maas += miktar
    }
}

fun main() {
    val personel = Personel("Ahmet", "Yılmaz", "Mühendis", 5000.0)
    println("Personelin adı: ${personel.ad}")
    println("Personelin soyadı: ${personel.soyad}")
    println("Personelin pozisyonu: ${personel.pozisyon}")
    println("Personelin maaşı: ${personel.maas}")

    personel.maasArttir(1000.0)
    println("Yeni maaş: ${personel.maas}")
}
