package com.dlight.trackergo.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.dlight.trackergo.repositories.MainRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    val mainRepository: MainRepository
): ViewModel() {
}