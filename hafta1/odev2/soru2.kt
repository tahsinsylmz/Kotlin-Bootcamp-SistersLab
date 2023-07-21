package com.kotlinegitim.hafta1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.toLowerCase
import androidx.compose.ui.tooling.preview.Preview
import com.kotlinegitim.hafta1.ui.theme.Hafta1Theme
import java.util.Locale




class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Hafta1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }


        fun main() {
            try {
                print("Yaşınızı giriniz: ")
                val ageInput = readLine()
                val age = ageInput?.toInt()

                if (age != null) {
                    if (age >= 18) {
                        println("Oy kullanabilirsiniz!")
                    } else {
                        println("Oy kullanamazsınız.")
                    }
                } else {
                    println("Geçerli bir yaş girmediniz.")
                }
            } catch (ex: NumberFormatException) {
                println("Sayı giriniz.")
            }
        }




    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Hafta1Theme {
        Greeting("Android")
    }
}