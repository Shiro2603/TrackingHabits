package com.example.trackinghabits.ui.root

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.trackinghabits.ui.mainScreen.MainScreen
import com.example.trackinghabits.ui.theme.TrackingHabitsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TrackingHabitsTheme {
                MainScreen()
            }
        }
    }
}