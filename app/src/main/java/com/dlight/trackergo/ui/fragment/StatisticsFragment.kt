package com.dlight.trackergo.ui.fragment

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.dlight.trackergo.R
import com.dlight.trackergo.ui.viewmodel.StatisticsViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class StatisticsFragment : Fragment(R.layout.fragment_statistics) {

    private val viewModel: StatisticsViewModel by viewModels()
}