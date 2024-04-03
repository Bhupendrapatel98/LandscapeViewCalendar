package com.app.horizontalcalendarlib

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.DiffUtil.DiffResult.NO_POSITION
import androidx.recyclerview.widget.RecyclerView

class CalendarAdapter(
    private val dates: List<HorizontalCalendarDate>,
    private val onDateSelected: (Int) -> Unit
) : RecyclerView.Adapter<CalendarAdapter.CalendarViewHolder>() {

    private var selectedPosition = RecyclerView.NO_POSITION

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CalendarViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.item_date, parent, false)
        return CalendarViewHolder(itemView, onDateSelected)
    }

    override fun onBindViewHolder(holder: CalendarViewHolder, position: Int) {
        val isSelected = position == selectedPosition

        dates[position].let { holder.bind(dates[position], position, isSelected) }
    }

    override fun getItemCount(): Int {
        return dates.size
    }

    class CalendarViewHolder(itemView: View, private val onDateSelected: (Int) -> Unit) :
        RecyclerView.ViewHolder(itemView) {

        private val textViewDay: TextView = itemView.findViewById(R.id.textViewDay)
        private val textViewDate: TextView = itemView.findViewById(R.id.textView_date)

        fun bind(date: HorizontalCalendarDate, position: Int, isSelected: Boolean) {
            textViewDay.text = date.getDayOfWeek()
            textViewDate.text = date.getDayOfMonth()

            if (isSelected) {
                textViewDate.setTextColor(ContextCompat.getColor(textViewDate.context,R.color.white))
                textViewDate.setBackgroundResource(R.drawable.red_dot)
            } else {
                textViewDate.setTextColor(ContextCompat.getColor(textViewDate.context,R.color.black))
                textViewDate.setBackgroundResource(0)
            }

            itemView.setOnClickListener { onDateSelected(position) }
        }
    }

    fun setSelectedPosition(position: Int) {
        selectedPosition = position
        notifyDataSetChanged()
    }

}