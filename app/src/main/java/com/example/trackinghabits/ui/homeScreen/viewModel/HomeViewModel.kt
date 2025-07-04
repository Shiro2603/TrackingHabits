package com.example.trackinghabits.ui.homeScreen.viewModel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.trackinghabits.domain.habit.HabitInteractor
import com.example.trackinghabits.ui.homeScreen.HomeScreenUi
import kotlinx.coroutines.launch

class HomeViewModel(
    private val interactor: HabitInteractor
) : ViewModel() {

    private val _screenState = MutableLiveData<HomeScreenUi>()
    val screenState : LiveData<HomeScreenUi> = _screenState

    fun getAllHabits() {
        viewModelScope.launch {
            interactor.getAllHabit().collect {
                _screenState.value = if(it.isEmpty()) {
                    HomeScreenUi.Empty
                } else {
                    HomeScreenUi.Content(it)

                }
            }

        }
    }

}