package com.example.trackinghabits.data.habit

import com.example.trackinghabits.domain.model.Habit
import kotlinx.coroutines.flow.Flow

interface HabitRepository {

    suspend fun addHabit(habit: Habit)
    fun getAllHabit() : Flow<List<Habit>>
}
