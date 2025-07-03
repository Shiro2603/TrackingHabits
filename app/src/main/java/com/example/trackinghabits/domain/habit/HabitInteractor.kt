package com.example.trackinghabits.domain.habit

import com.example.trackinghabits.domain.model.Habit
import kotlinx.coroutines.flow.Flow

interface HabitInteractor {

    suspend fun addHabit(habit: Habit)
    fun getAllHabit() : Flow<List<Habit>>
}