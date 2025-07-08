package com.example.fruithub

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.fruithub.screens.Home_Screen
import com.example.fruithub.screens.SplashScreen
import com.example.fruithub.screens.Wellcome_Screen
import com.example.fruithub.ui.theme.FruitHubTheme
import kotlinx.coroutines.delay

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Home_Screen()
            //FruitAppNavigation()
        }
    }
}

@Composable
fun FruitAppNavigation() {
    var showSplashScreen by remember { mutableStateOf(true) }
    LaunchedEffect(key1 = true) {
        delay(2000L)
        showSplashScreen = false
    }

    if (showSplashScreen) {
        SplashScreen()
    } else {
        Wellcome_Screen()
    }
}
