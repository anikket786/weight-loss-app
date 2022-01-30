package com.app.general.weightlossapp.ui.onBoarding

import android.view.LayoutInflater
import android.view.ViewGroup
import com.app.general.weightlossapp.databinding.FragmentExerciseLevelBinding
import com.app.general.weightlossapp.ui.base.BaseFragment

class ExerciseLevelFragment : BaseFragment<FragmentExerciseLevelBinding>() {

    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> FragmentExerciseLevelBinding
        get() = FragmentExerciseLevelBinding::inflate
}