package com.example.namecard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material.icons.rounded.Share
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.namecard.ui.theme.NamecardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NamecardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    NameCard()
                }
            }
        }
    }
}

@Composable
fun NameCard() {
    // Define constants
    val image = painterResource(R.drawable.logo) // Add an image into the Resource Manager
    val name = "Andy Royd"
    val title = "Average Android Enjoyer"
    val phone = "+00 (000) 000 000 000"
    val share = "@AndyRoydDev"
    val email = "andyroyd@android.com"


    Column(verticalArrangement = Arrangement.Center,
           horizontalAlignment = Alignment.CenterHorizontally,
           modifier = Modifier.background(Color(0xFFaddfad)).padding(top=150.dp)
          ) {
        Spacer(modifier=Modifier.weight(6f))
        // Logo
        Image(painter=image, contentDescription=null, modifier=Modifier.padding(start=100.dp, end=100.dp))

        // Name
        Text(text=name, fontSize=50.sp)

        // Title
        Text(text=title, fontSize=20.sp, color = Color(0xFF008000))
        Spacer(modifier=Modifier.weight(5f))

        // Phone
        Row(modifier=Modifier.padding(top=150.dp, bottom=15.dp)) {
            Icon(Icons.Rounded.Phone, contentDescription=null)
            Text(text=phone, modifier=Modifier.padding(start=20.dp))
        }

        // Share
        Row(modifier=Modifier.padding(end=60.dp)) {
            Icon(Icons.Rounded.Share, contentDescription=null)
            Text(text=share, modifier=Modifier.padding(start=20.dp))
        }

        // Email
        Row(modifier=Modifier.padding(top=15.dp)) {
            Icon(Icons.Rounded.Email, contentDescription=null)
            Text(text=email, modifier=Modifier.padding(start=20.dp))
        }
    }
}
