package com.example.trackinghabits.di

import com.example.trackinghabits.domain.habit.HabitInteractor
import com.example.trackinghabits.domain.habit.impl.HabitInteractorImpl
import org.koin.dsl.module

val interactorModule = module {

    single<HabitInteractor> {
        HabitInteractorImpl(get())
    }

}