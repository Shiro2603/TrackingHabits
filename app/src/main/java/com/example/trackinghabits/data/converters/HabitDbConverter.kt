package com.example.trackinghabits.data.converters

import com.example.trackinghabits.data.db.entity.HabitEntity
import com.example.trackinghabits.domain.model.Habit

class HabitDbConverter {

    fun map(habit: Habit) : HabitEntity {
       return HabitEntity(
           id = null,
           habitName = habit.habitName,
           description = habit.description
        )
    }

    fun map(habitEntity: HabitEntity) : Habit {
        return Habit(
            id = habitEntity.id,
            habitName = habitEntity.habitName,
            description = habitEntity.description
        )
    }

}