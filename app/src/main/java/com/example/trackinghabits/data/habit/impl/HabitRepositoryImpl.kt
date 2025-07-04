package com.example.trackinghabits.data.habit.impl

import com.example.trackinghabits.data.converters.HabitDbConverter
import com.example.trackinghabits.data.db.AppDatabase
import com.example.trackinghabits.data.habit.HabitRepository
import com.example.trackinghabits.domain.model.Habit
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class HabitRepositoryImpl(
    private val appDatabase: AppDatabase,
    private val converter: HabitDbConverter
) : HabitRepository {

    override suspend fun addHabit(habit: Habit) {
        val habitEntity = converter.map(habit)
        appDatabase.HabitDao().addHabit(habitEntity)
    }

    override fun getAllHabit(): Flow<List<Habit>>  {
        return appDatabase.HabitDao().getAllHabit().map { entityList ->
            entityList.map { converter.map(it) }
        }
    }

}