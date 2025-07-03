package com.example.trackinghabits.di

import com.example.trackinghabits.data.habit.HabitRepository
import com.example.trackinghabits.data.habit.impl.HabitRepositoryImpl
import org.koin.dsl.module

val repositoryModule = module {

    single<HabitRepository> {
        HabitRepositoryImpl(get(), get())
    }

}