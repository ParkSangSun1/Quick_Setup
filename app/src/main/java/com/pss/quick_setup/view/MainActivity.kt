package com.pss.quick_setup.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.pss.quick_setup.R
import com.pss.quick_setup.base.BaseActivity
import com.pss.quick_setup.databinding.ActivityMainBinding
import com.pss.quick_setup.viewmodel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding>(R.layout.activity_main) {
    private val mainViewModel by viewModels<MainViewModel>()


    override fun init() {

    }
}