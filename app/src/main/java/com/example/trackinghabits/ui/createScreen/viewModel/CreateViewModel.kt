package com.example.trackinghabits.ui.createScreen.viewModel

import androidx.lifecycle.ViewModel
import com.example.trackinghabits.domain.habit.HabitInteractor
import com.example.trackinghabits.domain.model.Habit

class CreateViewModel(
    val interactor: HabitInteractor
) : ViewModel() {

    suspend fun addHabit(habit: Habit) {
        interactor.addHabit(habit)
    }

}