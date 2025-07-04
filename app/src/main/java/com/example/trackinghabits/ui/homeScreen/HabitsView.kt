package com.example.trackinghabits.ui.homeScreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.example.trackinghabits.domain.model.Habit

@Composable
fun HabitsView(habits: Habit) {
    Column {
        Row {
            Text(
                text = habits.habitName
            )

        }
    }
}
