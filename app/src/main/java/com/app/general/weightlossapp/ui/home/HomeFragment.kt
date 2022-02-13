package com.app.general.weightlossapp.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import com.app.general.weightlossapp.databinding.FragmentHomeBinding
import com.app.general.weightlossapp.ui.base.BaseFragment

class HomeFragment : BaseFragment<FragmentHomeBinding>() {

    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> FragmentHomeBinding
        get() = FragmentHomeBinding::inflate
}