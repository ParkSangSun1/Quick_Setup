package com.pss.clean_architecture_sample.view

import androidx.activity.viewModels
import com.pss.clean_architecture_sample.R
import com.pss.clean_architecture_sample.base.BaseActivity
import com.pss.clean_architecture_sample.databinding.ActivityMainBinding
import com.pss.clean_architecture_sample.viewmode.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding>(R.layout.activity_main) {
    private val mainViewModel by viewModels<MainViewModel>()


    override fun init() {

    }
}