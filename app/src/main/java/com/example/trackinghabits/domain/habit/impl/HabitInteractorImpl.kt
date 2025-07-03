package com.example.trackinghabits.domain.habit.impl

import com.example.trackinghabits.data.habit.HabitRepository
import com.example.trackinghabits.domain.habit.HabitInteractor
import com.example.trackinghabits.domain.model.Habit
import kotlinx.coroutines.flow.Flow

class HabitInteractorImpl(private val repository : HabitRepository) : HabitInteractor {

    override suspend fun addHabit(habit: Habit) {
        repository.addHabit(habit)
    }

    override fun getAllHabit(): Flow<List<Habit>> {
        return repository.getAllHabit()
    }
}