package com.app.general.weightlossapp.ui.onBoarding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.app.general.weightlossapp.databinding.FragmentInitialIntroBinding
import com.app.general.weightlossapp.ui.base.BaseFragment

class InitialIntroFragment : BaseFragment<FragmentInitialIntroBinding>() {

    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> FragmentInitialIntroBinding
        get() = FragmentInitialIntroBinding::inflate

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupListeners()
    }

    private fun setupListeners() {
        binding.btnNext.setOnClickListener {
            val action = InitialIntroFragmentDirections
                .actionInitialIntroFragmentToExerciseLevelFragment()
            findNavController().navigate(action)
        }
    }
}