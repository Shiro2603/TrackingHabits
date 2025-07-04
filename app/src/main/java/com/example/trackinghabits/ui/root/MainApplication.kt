package com.example.trackinghabits.ui.root

import android.app.Application
import com.example.trackinghabits.di.dataModule
import com.example.trackinghabits.di.interactorModule
import com.example.trackinghabits.di.repositoryModule
import com.example.trackinghabits.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@MainApplication)
            modules(dataModule, interactorModule, repositoryModule, viewModelModule)
        }
    }

}