package com.app.general.weightlossapp.ui.home

import android.view.LayoutInflater
import com.app.general.weightlossapp.databinding.ActivityHomeBinding
import com.app.general.weightlossapp.ui.base.BaseActivity

class HomeActivity : BaseActivity<ActivityHomeBinding>() {

    override val bindingInflater: (LayoutInflater) -> ActivityHomeBinding
        get() = ActivityHomeBinding::inflate


}