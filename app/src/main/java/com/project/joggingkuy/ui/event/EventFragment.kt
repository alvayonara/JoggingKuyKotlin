package com.project.joggingkuy.ui.event

import android.view.LayoutInflater
import android.view.ViewGroup
import com.project.joggingkuy.core.base.BaseFragment
import com.project.joggingkuy.databinding.FragmentEventBinding

class EventFragment : BaseFragment<FragmentEventBinding>() {

    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> FragmentEventBinding
        get() = FragmentEventBinding::inflate

    override fun setup() {
        TODO("Not yet implemented")
    }
}