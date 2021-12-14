package com.pss.data.repository.remote.datasource

import com.pss.data.remote.model.TestResponse
import retrofit2.Response

interface MainDataSource {
    suspend fun test() : Response<TestResponse>
}