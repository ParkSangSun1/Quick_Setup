package com.pss.clean_architecture_sample.viewmode

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.pss.domain.usecase.TestUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val testUseCase: TestUseCase
) : ViewModel() {

    fun test() = viewModelScope.launch {
        testUseCase.execute().let { response ->

        }
    }
}