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
            // Önceden belirlenen kullanıcı adı ve şifre
            val correctUsername = "Tahsin"
            val correctPassword = "Sifre123"

            // Kullanıcıdan kullanıcı adı ve şifre girişi alınması
            print("Kullanıcı Adı: ")
            val enteredUsername = readLine()?.toLowerCase()

            print("Şifre: ")
            val enteredPassword = readLine()

            // Kullanıcı adı ve şifre kontrolü
            if (enteredUsername == correctUsername && enteredPassword == correctPassword) {
                println("Hoş Geldiniz!")
            } else {
                println("Kullanıcı Adı veya Şifre Hatalı!")
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