package com.project.joggingkuy.ui.dashboard

import android.view.LayoutInflater
import com.project.joggingkuy.core.base.BaseActivity
import com.project.joggingkuy.databinding.ActivityDashboardBinding

class DashboardActivity : BaseActivity<ActivityDashboardBinding>() {

    override val bindingInflater: (LayoutInflater) -> ActivityDashboardBinding
        get() = ActivityDashboardBinding::inflate

    override fun loadInjector() {
        TODO("Not yet implemented")
    }

    override fun setup() {
        TODO("Not yet implemented")
    }
}