package com.app.general.weightlossapp.ui.commons

import android.app.Activity
import android.content.Intent
import android.os.Bundle

fun <A : Activity> Activity.finishAndStartNewActivity(activity: Class<A>, bundle: Bundle? = null) {
    Intent(this, activity).also { intent ->
        bundle?.let { intent.putExtras(bundle) }
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        startActivity(intent)
    }
}

fun <A : Activity> Activity.startNewActivity(activity: Class<A>, bundle: Bundle? = null) {
    Intent(this, activity).also { intent ->
        bundle?.let {
            intent.putExtras(bundle)
        }
        startActivity(intent)
    }
}