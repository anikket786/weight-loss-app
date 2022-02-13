package com.app.general.weightlossapp.ui.base

import android.app.AlertDialog
import android.os.Bundle
import android.view.*
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.viewbinding.ViewBinding
import com.app.general.weightlossapp.R

/**
 * Abstract activity class containing all the repeated code
 * which must be commonly present in each activity of this app
 */
abstract class BaseActivity<VB : ViewBinding> : AppCompatActivity() {
    protected val TAG = this.javaClass.simpleName

    private var _binding : ViewBinding? = null
    abstract val bindingInflater : (LayoutInflater) -> VB

    private lateinit var progressBar : AlertDialog

    @Suppress("UNCHECKED_CAST")
    protected val binding : VB
        get() = _binding as VB

    override fun onCreate(savedInstanceState: Bundle?) {
        installSplashScreen()
        window.navigationBarColor = ContextCompat.getColor(this, R.color.reply_blue_800)
        super.onCreate(savedInstanceState)
        _binding = bindingInflater.invoke(layoutInflater)
        setContentView(requireNotNull(_binding).root)
    }
}