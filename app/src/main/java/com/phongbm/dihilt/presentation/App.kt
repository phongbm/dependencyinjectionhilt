package com.phongbm.dihilt.presentation

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

/**
 * Created by PhongBM on 06/17/2020
 */

@HiltAndroidApp
class App : Application() {
    override fun onCreate() {
        super.onCreate()
    }

}