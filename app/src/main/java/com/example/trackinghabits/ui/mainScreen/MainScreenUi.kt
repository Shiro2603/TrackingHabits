package com.example.trackinghabits.ui.mainScreen

import com.example.trackinghabits.domain.model.Habit

sealed interface MainScreenUi {

    object Loading : MainScreenUi
    data class Content(
        val habit: List<Habit>
    ) : MainScreenUi

}
