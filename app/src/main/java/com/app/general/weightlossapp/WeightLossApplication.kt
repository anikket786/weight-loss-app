package com.app.general.weightlossapp

import android.app.Application
import android.content.ContentResolver
import androidx.appcompat.app.AppCompatDelegate
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class WeightLossApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        instance = this
        resolver = this.contentResolver
    }

    companion object {
        @JvmStatic
        lateinit var instance: WeightLossApplication
        lateinit var resolver: ContentResolver
    }
}