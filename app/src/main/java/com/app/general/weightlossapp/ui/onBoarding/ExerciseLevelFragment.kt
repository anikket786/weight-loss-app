package com.app.general.weightlossapp.ui.onBoarding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.DrawableRes
import androidx.appcompat.widget.AppCompatImageView
import androidx.core.content.res.ResourcesCompat
import com.app.general.weightlossapp.R
import com.app.general.weightlossapp.databinding.FragmentExerciseLevelBinding
import com.app.general.weightlossapp.ui.base.BaseFragment
import com.app.general.weightlossapp.ui.commons.finishAndStartNewActivity
import com.app.general.weightlossapp.ui.commons.startNewActivity
import com.app.general.weightlossapp.ui.home.HomeActivity

class ExerciseLevelFragment : BaseFragment<FragmentExerciseLevelBinding>() {

    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> FragmentExerciseLevelBinding
        get() = FragmentExerciseLevelBinding::inflate

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupViews()
        setupListeners()
    }

    private fun setupViews() {
        with(binding) {
            cvBeginner.tvTitle.text = getString(R.string.beginner)
            cvBeginner.tvSubTitle.text = String.format(
                getString(R.string.min_a_day_subtitle), 5, 10
            )

            cvIntermediate.tvTitle.text = getString(R.string.intermediate)
            cvIntermediate.tvSubTitle.text = String.format(
                getString(R.string.min_a_day_subtitle), 15, 20
            )

            cvAdvanced.tvTitle.text = getString(R.string.advanced)
            cvAdvanced.tvSubTitle.text = String.format(
                getString(R.string.min_a_day_subtitle), 25, 30
            )
        }
    }

    private fun setupListeners() {
        with(binding) {
            cvBeginner.root.setOnClickListener {
                setSelectedCardDrawable(cvBeginner.ivSelectStatus, R.drawable.ic_check_mark)
            }

            cvIntermediate.root.setOnClickListener {
                setSelectedCardDrawable(cvIntermediate.ivSelectStatus, R.drawable.ic_check_mark)
            }

            cvAdvanced.root.setOnClickListener {
                setSelectedCardDrawable(cvAdvanced.ivSelectStatus, R.drawable.ic_check_mark)
            }

            btnNext.setOnClickListener {
                activity?.finishAndStartNewActivity(HomeActivity::class.java)
            }
        }
    }

    private fun setSelectedCardDrawable(selectedView : AppCompatImageView, @DrawableRes drawable : Int) {
        with(binding) {
            cvBeginner.ivSelectStatus.setImageDrawable(
                ResourcesCompat.getDrawable(resources, R.drawable.circle_reply_blue_800, resources.newTheme())
            )
            cvIntermediate.ivSelectStatus.setImageDrawable(
                ResourcesCompat.getDrawable(resources, R.drawable.circle_reply_blue_800, resources.newTheme())
            )
            cvAdvanced.ivSelectStatus.setImageDrawable(
                ResourcesCompat.getDrawable(resources, R.drawable.circle_reply_blue_800, resources.newTheme())
            )

            selectedView.setImageDrawable(
                ResourcesCompat.getDrawable(resources, drawable, resources.newTheme())
            )
        }
    }
}