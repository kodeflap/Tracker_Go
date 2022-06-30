package com.dlight.trackergo.util

import android.content.Context
import android.icu.util.Calendar
import com.dlight.trackergo.db.Run
import com.github.mikephil.charting.components.MarkerView
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.highlight.Highlight
import com.github.mikephil.charting.utils.MPPointF
import kotlinx.android.synthetic.main.marker_view.view.*
import java.text.SimpleDateFormat
import java.util.*

class CustomMarkerView(
    val runs: List<Run>,
    context: Context,
    layoutId: Int
) : MarkerView(context, layoutId){

    override fun getOffset(): MPPointF {
        return MPPointF(-width / 2f, -height.toFloat())

    }

    override fun refreshContent(e: Entry?, highlight: Highlight?) {
        super.refreshContent(e, highlight)
        if (e == null) {
            return
        }
        val curRunId = e.x.toInt()
        val run = runs[curRunId]

        val calendar = Calendar.getInstance().apply { timeInMillis = run.timestamp }

        val dateFormat = SimpleDateFormat("dd.mm.yy", Locale.getDefault())
        markerDate.text = dateFormat.format(calendar.time)

        val avgSpeed = "${run.avgSpeedInKMH} km"
        markerAvgSpeed.text = avgSpeed

        val distanceInKm = "${run.distanceInMeters / 1000f} km"
        markerDistance.text = distanceInKm

        markerDuration.text = TrackingUtility.getFormattedStopWatchTime(run.timeInMills)

        val caloriesBurned = "${run.caloriesBurned} kcal"
        markerCaloriesBurned.text = caloriesBurned
    }
}