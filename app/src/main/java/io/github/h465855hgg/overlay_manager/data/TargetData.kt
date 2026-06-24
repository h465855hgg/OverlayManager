package io.github.h465855hgg.overlay_manager.data

import android.content.Context
import android.content.pm.ApplicationInfo
import android.graphics.drawable.Drawable
import io.github.h465855hgg.overlay_manager.proxy.OverlayInfo

data class TargetData(
    val appInfo: ApplicationInfo,
    val info: List<OverlayInfo>,
    var expanded: Boolean = false
) {
    private var label: CharSequence? = null

    fun getLabel(context: Context): CharSequence {
        if (label != null) return label!!

        return appInfo.loadLabel(context.packageManager)
    }
}