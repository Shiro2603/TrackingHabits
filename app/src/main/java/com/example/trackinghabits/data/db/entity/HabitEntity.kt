package com.example.trackinghabits.data.db.entity

import androidx.room.Entity

@Entity(tableName = "habit_table")
data class HabitEntity(
    val id: Long?,
    val habitName: String,
    val description: String,
)