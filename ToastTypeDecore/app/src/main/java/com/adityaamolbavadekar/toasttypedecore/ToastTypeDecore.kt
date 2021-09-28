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
        backgroundColor: Int?,
        longLengthenedToast : Boolean
    ) {
        val toast = Toast(context)
        if (longLengthenedToast){
            toast.duration = Toast.LENGTH_LONG
        }else if (!longLengthenedToast){
            toast.duration = Toast.LENGTH_SHORT
        }
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
        toast.show()//Show the Toast

    }



}