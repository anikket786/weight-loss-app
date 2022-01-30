package com.app.general.weightlossapp.ui.onBoarding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.app.general.weightlossapp.databinding.FragmentInitialIntroBinding

class InitialIntroFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        super.onCreateView(inflater, container, savedInstanceState)
        return FragmentInitialIntroBinding.inflate(inflater, container, false).root
    }
}