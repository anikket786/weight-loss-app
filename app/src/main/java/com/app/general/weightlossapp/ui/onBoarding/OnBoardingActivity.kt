package com.app.general.weightlossapp.ui.onBoarding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AppCompatDelegate
import androidx.core.content.ContextCompat
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.app.general.weightlossapp.R

class OnBoardingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
        window.navigationBarColor = ContextCompat.getColor(this, R.color.reply_blue_800)
        installSplashScreen()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_boarding)
    }
}