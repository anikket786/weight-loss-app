package com.app.general.weightlossapp.ui.onBoarding

import android.view.LayoutInflater
import com.app.general.weightlossapp.databinding.ActivityOnBoardingBinding
import com.app.general.weightlossapp.ui.base.BaseActivity

class OnBoardingActivity : BaseActivity<ActivityOnBoardingBinding>() {

    override val bindingInflater: (LayoutInflater) -> ActivityOnBoardingBinding
        get() = ActivityOnBoardingBinding::inflate
}