package io.github.h465855hgg.overlay_manager.views

import android.annotation.SuppressLint
import android.content.Context
import android.util.AttributeSet
import com.google.android.material.internal.CheckableImageButton
import io.github.h465855hgg.overlay_manager.util.addTooltip

@SuppressLint("RestrictedApi")
class CheckableImageButton(context: Context, attrs: AttributeSet) : CheckableImageButton(context, attrs) {
    private var mOnCheckedChangeListener: OnCheckedChangeListener? = null
    private var mBroadcasting = false

    init {
        addTooltip()
    }

    fun setOnCheckedChangeListener(listener: OnCheckedChangeListener?) {
        mOnCheckedChangeListener = listener
    }

    fun setOnCheckedChangeListener(listener: (io.github.h465855hgg.overlay_manager.views.CheckableImageButton, Boolean) -> Unit) {
        setOnCheckedChangeListener(object : OnCheckedChangeListener {
            override fun onCheckedChanged(
                buttonView: io.github.h465855hgg.overlay_manager.views.CheckableImageButton,
                checked: Boolean
            ) {
                listener(buttonView, checked)
            }
        })
    }

    override fun performClick(): Boolean {
        toggle()
        return super.performClick()
    }

    //Overridden to avoid annoying warnings
    override fun isChecked(): Boolean {
        return super.isChecked()
    }

    //Overridden to avoid annoying warnings
    override fun setChecked(checked: Boolean) {
        val changed = checked != isChecked

        super.setChecked(checked)

        if (mBroadcasting) {
            return
        }

        if (changed) {
            mBroadcasting = true
            mOnCheckedChangeListener?.onCheckedChanged(this, checked)
            mBroadcasting = false
        }
    }

    interface OnCheckedChangeListener {
        fun onCheckedChanged(buttonView: io.github.h465855hgg.overlay_manager.views.CheckableImageButton, checked: Boolean)
    }
}