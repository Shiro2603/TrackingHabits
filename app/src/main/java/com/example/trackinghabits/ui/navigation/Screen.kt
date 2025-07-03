package com.example.trackinghabits.ui.navigation

sealed class Screen(val route: String) {
    object Home : Screen("home")
    object Create : Screen("create")
}