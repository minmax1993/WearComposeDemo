package com.example.android.wearable.composeforwearos.model

sealed class Screen {
    object Main : Screen() {
        val route = "Main"
    }

    object Details : Screen() {
        val route = "Details"
    }
}