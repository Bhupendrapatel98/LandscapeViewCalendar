package com.app.horizontalcalendarlib

import java.text.SimpleDateFormat
import java.util.*

data class HorizontalCalendarDate(val date: Date){
    fun isSameDay(otherDate: Date): Boolean {
        val sdf = SimpleDateFormat("yyyyMMdd", Locale.getDefault())
        return sdf.format(date) == sdf.format(otherDate)
    }

    fun getDayOfWeek(): String {
        val dayFormat = SimpleDateFormat("EEE", Locale.getDefault())
        return dayFormat.format(date)
    }

    fun getDayOfMonth(): String {
        val dateFormat = SimpleDateFormat("dd", Locale.getDefault())
        return dateFormat.format(date)
    }
}
