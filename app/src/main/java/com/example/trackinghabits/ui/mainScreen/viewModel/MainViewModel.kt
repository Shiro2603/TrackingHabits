package com.example.trackinghabits.ui.mainScreen.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.trackinghabits.ui.mainScreen.MainScreenUi

class MainViewModel : ViewModel() {

    private val _screenState = MutableLiveData<MainScreenUi>()
    val screenState : LiveData<MainScreenUi> = _screenState

}