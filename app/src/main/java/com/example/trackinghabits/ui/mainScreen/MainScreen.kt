package com.example.trackinghabits.ui.mainScreen

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.trackinghabits.ui.createScreen.CreateScreen
import com.example.trackinghabits.ui.homeScreen.HomeScreen
import com.example.trackinghabits.ui.navigation.Screen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen() {
    val navController  = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Screen.Home.route
    ) {
        composable(Screen.Home.route) {
            HomeScreen {
                navController.navigate(Screen.Create.route)
            }
        }

        composable(Screen.Create.route) {
            CreateScreen(navController)
        }
    }

}
