package io.github.h465855hgg.overlay_manager.views

import android.content.Context
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatImageButton
import io.github.h465855hgg.overlay_manager.util.addTooltip

class TooltippedImageButton(context: Context, attrs: AttributeSet) : AppCompatImageButton(context, attrs) {
    init {
        addTooltip()
    }
}