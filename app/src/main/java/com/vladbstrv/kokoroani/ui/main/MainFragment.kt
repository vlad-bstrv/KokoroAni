package com.vladbstrv.kokoroani.ui.main

import org.koin.androidx.viewmodel.ext.android.viewModel
import android.view.LayoutInflater
import android.view.ViewGroup
import com.vladbstrv.kokoroani.databinding.MainFragmentBinding
import com.vladbstrv.kokoroani.ui.BaseFragment

class MainFragment : BaseFragment<MainFragmentBinding>() {

    private val viewModel: MainViewModel by viewModel()

    override fun initBinding(inflater: LayoutInflater, container: ViewGroup?): MainFragmentBinding {
        return MainFragmentBinding.inflate(inflater, container, false)
    }

}