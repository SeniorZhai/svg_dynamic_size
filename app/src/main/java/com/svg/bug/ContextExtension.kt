package com.svg.bug

import android.content.Context

fun Context.dpToPx(dp: Float): Int {
    return if (dp == 0f) {
        0
    } else {
        Math.ceil((this.resources.displayMetrics.density * dp).toDouble()).toInt()
    }
}