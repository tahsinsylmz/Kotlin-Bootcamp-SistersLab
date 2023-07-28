package com.kotlinegitim.hafta2odev
import kotlin.math.PI

// GeometrikSekil adlı üst sınıf
open class GeometrikSekil {
    open fun alan(): Double {
        return 0.0
    }

    open fun cevre(): Double {
        return 0.0
    }
}

// Dikdortgen adlı alt sınıf
class Dikdortgen(private val uzunluk: Double, private val genislik: Double) : GeometrikSekil() {
    override fun alan(): Double {
        return uzunluk * genislik
    }

    override fun cevre(): Double {
        return 2 * (uzunluk + genislik)
    }
}

// Daire adlı alt sınıf
class Daire(private val yaricap: Double) : GeometrikSekil() {
    override fun alan(): Double {
        return PI * yaricap * yaricap
    }

    override fun cevre(): Double {
        return 2 * PI * yaricap
    }
}

fun main() {
    val dikdortgen = Dikdortgen(5.0, 3.0)
    println("Dikdörtgenin Alanı: ${dikdortgen.alan()}")
    println("Dikdörtgenin Çevresi: ${dikdortgen.cevre()}")

    val daire = Daire(4.0)
    println("Dairenin Alanı: ${daire.alan()}")
    println("Dairenin Çevresi: ${daire.cevre()}")
}

