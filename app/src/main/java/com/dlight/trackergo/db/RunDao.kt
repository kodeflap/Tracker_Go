package com.dlight.trackergo.db

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface RunDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertRun(run: Run)

    @Delete
    suspend fun deleteRun(run: Run)

    @Query("SELECT * FROM tracker ORDER BY timestamp DESC")
    fun getAllRunSortByDate(): LiveData<List<Run>>

    @Query("SELECT * FROM tracker ORDER BY timeInMills DESC")
    fun getAllRunSortByTimeInMill(): LiveData<List<Run>>

    @Query("SELECT * FROM tracker ORDER BY caloriesBurned DESC")
    fun getAllRunSortByCaloriesBurned(): LiveData<List<Run>>

    @Query("SELECT * FROM tracker ORDER BY avgSpeedInKMH DESC")
    fun getAllRunSortByAvgSpeed(): LiveData<List<Run>>

    @Query("SELECT * FROM tracker ORDER BY distanceInMeters DESC")
    fun getAllRunSortByDistance(): LiveData<List<Run>>

    @Query("SELECT SUM(timeInMills) FROM tracker")
    fun getTotalTimeInMills(): LiveData<Long>

    @Query("SELECT SUM(caloriesBurned) FROM tracker")
    fun getTotalCaloriesBurned(): LiveData<Int>

    @Query("SELECT SUM(distanceInMeters) FROM tracker")
    fun getTotalTDistance(): LiveData<Int>

    @Query("SELECT AVG(avgSpeedInKMH) FROM tracker")
    fun getTotalAverageSpeed(): LiveData<Long>


}