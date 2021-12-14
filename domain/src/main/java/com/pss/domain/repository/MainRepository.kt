package com.pss.domain.repository

import com.pss.domain.model.TestResponse

interface MainRepository {
    suspend fun test() : TestResponse
}