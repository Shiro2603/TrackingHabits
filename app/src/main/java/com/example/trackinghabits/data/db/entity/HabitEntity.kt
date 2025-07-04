package com.example.trackinghabits.data.db.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "habit_table")
data class HabitEntity(
    @PrimaryKey
    val id: Long?,
    val habitName: String,
    val description: String,
)