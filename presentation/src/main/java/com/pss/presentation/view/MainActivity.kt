package com.pss.presentation.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.pss.presentation.R
import com.pss.presentation.base.BaseActivity
import com.pss.presentation.databinding.ActivityMainBinding
import com.pss.presentation.viewmode.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding>(R.layout.activity_main) {
    private val mainViewModel by viewModels<MainViewModel>()


    override fun init() {

    }
}