package com.example.trackinghabits.ui.homeScreen

import com.example.trackinghabits.domain.model.Habit

sealed interface HomeScreenUi {

    object Empty : HomeScreenUi
    object Loading : HomeScreenUi
    data class Content(
        val habit: List<Habit>
    ) : HomeScreenUi

}