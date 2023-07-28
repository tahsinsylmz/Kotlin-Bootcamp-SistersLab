package com.kotlinegitim.hafta2odev

class Kullanici(val ad: String?, val soyad: String?) {
    fun tamAdiAl(): String {
        val tamAd = StringBuilder()
        if (!ad.isNullOrEmpty()) {
            tamAd.append(ad)
        }
        if (!soyad.isNullOrEmpty()) {
            if (tamAd.isNotEmpty()) {
                tamAd.append(" ")
            }
            tamAd.append(soyad)
        }
        return tamAd.toString()
    }
}

fun main() {
    val kullanici1 = Kullanici("Ali", "Yılmaz")
    val kullanici2 = Kullanici("Mehmet", null)
    val kullanici3 = Kullanici(null, "Demir")
    val kullanici4 = Kullanici(null, null)

    println("Kullanıcı 1 adı: ${kullanici1.ad}, Soyadı: ${kullanici1.soyad}, Tam Adı: ${kullanici1.tamAdiAl()}")
    println("Kullanıcı 2 adı: ${kullanici2.ad}, Soyadı: ${kullanici2.soyad}, Tam Adı: ${kullanici2.tamAdiAl()}")
    println("Kullanıcı 3 adı: ${kullanici3.ad}, Soyadı: ${kullanici3.soyad}, Tam Adı: ${kullanici3.tamAdiAl()}")
    println("Kullanıcı 4 adı: ${kullanici4.ad}, Soyadı: ${kullanici4.soyad}, Tam Adı: ${kullanici4.tamAdiAl()}")
}

/*
null olan birimler yerine boş bir dize yazdırılır.
Bu sayede kullanıcı adı veya soyadı null olan
kullanıcılardan sadece diğer bilgiler ekrana
yazdırılır ve tam adlarında null birimler yer almaz.
 */
