package com.kotlinegitim.hafta2odev

// Oyuncu adlı üst sınıf
open class Oyuncu(val ad: String, val yas: Int) {
    open fun oyna() {
        println("$ad oynuyor.")
    }
}

// Futbolcu adlı alt sınıf
class Futbolcu(ad: String, yas: Int, val takim: String) : Oyuncu(ad, yas) {
    fun kos() {
        println("$ad koşuyor.")
    }

    override fun oyna() {
        println("$ad $takim takımında futbol oynuyor.")
    }
}

// Basketbolcu adlı alt sınıf
class Basketbolcu(ad: String, yas: Int, val takim: String) : Oyuncu(ad, yas) {
    fun smac() {
        println("$ad smaç yapıyor.")
    }

    override fun oyna() {
        println("$ad $takim takımında basketbol oynuyor.")
    }
}

fun main() {
    val futbolcu = Futbolcu("Ali", 25, "Galatasaray")
    futbolcu.oyna()
    futbolcu.kos()

    val basketbolcu = Basketbolcu("Ayşe", 28, "Fenerbahçe")
    basketbolcu.oyna()
    basketbolcu.smac()
}
