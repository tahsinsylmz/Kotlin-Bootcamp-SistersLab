package com.kotlinegitim.sisterslabhafta3
import kotlin.concurrent.thread

fun main() {
    println("Ana thread başladı.")

    // İlk thread: 5 saniye uyuyacak
    thread {
        println("Thread 1 başladı.")
        Thread.sleep(5000)
        println("Thread 1 tamamlandı.")
    }

    // İkinci thread: 3 saniye uyuyacak
    thread {
        println("Thread 2 başladı.")
        Thread.sleep(3000)
        println("Thread 2 tamamlandı.")
    }

    // Ana thread 6 saniye uyuyacak ve diğer threadlerin bitmesini bekleyecek
    Thread.sleep(6000)

    println("Ana thread tamamlandı.")
}

