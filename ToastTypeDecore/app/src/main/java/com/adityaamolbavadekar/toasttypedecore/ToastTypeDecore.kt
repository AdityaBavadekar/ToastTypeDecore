package com.adityaamolbavadekar.toasttypedecore


import android.content.Context
import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView

object ToastTypeDecor {

    fun makeSuccessToast(
        context: Context,
        contentText: String,
        successImageDrawableResId: Int?,
        cornerRadius: Float?,
        backgroundColor: Int?
    ) {
        val toast = Toast(context)
        toast.duration = Toast.LENGTH_LONG
        val customView =
            LayoutInflater.from(context).inflate(R.layout.success_toast_layout, null)
        customView.findViewById<TextView>(R.id.success_toast_main_content).text = contentText
        if (successImageDrawableResId != null) {
            customView.findViewById<ImageView>(R.id.success_toast_main_drawable)
                .setImageResource(successImageDrawableResId)
        }
        if (cornerRadius != null) {
            customView.findViewById<CardView>(R.id.success_toast_main_card_view).radius =
                cornerRadius
        }
        if (backgroundColor != null) {
            customView.findViewById<LinearLayout>(R.id.success_toast_main_layout)
                .setBackgroundColor(backgroundColor)
        }
        toast.view = customView
        toast.show()

    }

}