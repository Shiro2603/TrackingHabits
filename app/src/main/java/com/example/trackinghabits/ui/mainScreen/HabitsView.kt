package com.example.trackinghabits.ui.mainScreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun HabitsView(habits: String) {
    Column {
        Row {
            Text(
                text = habits
            )

        }
    }
}
