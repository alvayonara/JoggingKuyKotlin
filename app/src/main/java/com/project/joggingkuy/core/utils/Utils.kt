package com.project.joggingkuy.core.utils

import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.afollestad.materialdialogs.MaterialDialog
import com.afollestad.materialdialogs.WhichButton
import com.afollestad.materialdialogs.actions.getActionButton
import com.afollestad.materialdialogs.callbacks.onShow

fun View.visible() {
    visibility = View.VISIBLE
}

fun View.gone() {
    visibility = View.GONE
}

/**
 * Intent configuration
 */
inline fun <reified T : AppCompatActivity> Context.moveActivity() {
    Intent(this, T::class.java).also { intent ->
        startActivity(intent)
    }
}

/**
 * Base Material Dialog
 */
fun showMaterialDialog(
    context: Context,
    title: Int,
    message: Int,
    positiveText: Int,
    negativeText: Int,
    actionPositive: () -> Unit,
    actionNegative: () -> Unit
) {
    MaterialDialog(context).show {
        title(title)
        message(message)
        positiveButton(positiveText) {
            dismiss()
            actionPositive()
        }
        negativeButton(negativeText) {
            dismiss()
            actionNegative()
        }
        cancelable(false)
        onShow {
            it.getActionButton(WhichButton.POSITIVE).updateTextColor(Color.BLACK)
            it.getActionButton(WhichButton.NEGATIVE).updateTextColor(Color.BLACK)
        }
    }
}