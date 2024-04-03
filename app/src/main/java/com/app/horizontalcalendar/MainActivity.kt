package com.app.horizontalcalendar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import com.app.horizontalcalendarlib.DateSelectedListener
import com.app.horizontalcalendarlib.HorizontalCalendarDate
import com.app.horizontalcalendarlib.HorizontalCalendarView
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val horizontalCalendarView:HorizontalCalendarView = findViewById(R.id.horizontalCalendarView)


        // Set listener for date selection
        horizontalCalendarView.setOnDateSelectedListener(object : DateSelectedListener {
            override fun onDateSelected(date: Date?) {
                // Handle date selection
                // You can use the selected date here
                Log.d("dat123e", "onDateSelected: $date")
            }
        })
    }
}