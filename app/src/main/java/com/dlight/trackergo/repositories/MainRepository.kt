package com.dlight.trackergo.repositories

import com.dlight.trackergo.db.Run
import com.dlight.trackergo.db.RunDao
import javax.inject.Inject

class MainRepository @Inject constructor(
    val runDao: RunDao
){
    suspend fun insertRun(run: Run) = runDao.insertRun(run)

    suspend fun deleteRun(run: Run) = runDao.deleteRun(run)

    fun getAllRunSortedByDate() = runDao.getAllRunSortByDate()

    fun getAllRunSortedByDistance() = runDao.getAllRunSortByDistance()

    fun getAllRunSortedByTimeInMill() = runDao.getAllRunSortByTimeInMill()

    fun getAllRunSortedByAvgSpeed() = runDao.getAllRunSortByAvgSpeed()

    fun getAllRunSortedByCaloriesBurned() = runDao.getAllRunSortByCaloriesBurned()

    fun getTotalAvgSpeed() = runDao.getTotalAverageSpeed()

    fun getTotalDistance() = runDao.getTotalTDistance()

    fun getTotalCaloriesBurned() = runDao.getTotalCaloriesBurned()

    fun getTotalTimeInMills() = runDao.getTotalTimeInMills()
}