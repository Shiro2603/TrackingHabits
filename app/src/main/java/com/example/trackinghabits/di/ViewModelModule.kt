package com.example.trackinghabits.di

import com.example.trackinghabits.ui.createScreen.viewModel.CreateViewModel
import com.example.trackinghabits.ui.homeScreen.viewModel.HomeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {

    viewModel {
        CreateViewModel(get())
    }

    viewModel {
        HomeViewModel(get())
    }

}