package com.example.trackinghabits.ui.createScreen.viewModel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.trackinghabits.domain.habit.HabitInteractor
import com.example.trackinghabits.domain.model.Habit
import kotlinx.coroutines.launch

class CreateViewModel(
   private val interactor: HabitInteractor
) : ViewModel() {

     fun addHabit(habit: Habit) {
        viewModelScope.launch {
            interactor.addHabit(habit)
            Log.d("HabitCheck", "Текущее содержимое: $habit")
        }
    }

}