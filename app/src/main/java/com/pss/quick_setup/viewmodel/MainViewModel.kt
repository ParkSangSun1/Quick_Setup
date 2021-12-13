package com.pss.quick_setup.viewmodel

import androidx.lifecycle.ViewModel
import com.pss.quick_setup.repository.MainRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    val mainRepository: MainRepository
) : ViewModel() {

}