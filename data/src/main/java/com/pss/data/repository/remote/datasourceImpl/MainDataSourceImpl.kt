package com.pss.data.repository.remote.datasourceImpl

import com.pss.data.remote.api.SampleApi
import com.pss.data.remote.model.TestResponse
import com.pss.data.repository.remote.datasource.MainDataSource
import dagger.Binds
import retrofit2.Response
import javax.inject.Inject

class MainDataSourceImpl @Inject constructor(
    private val sampleApi: SampleApi
) : MainDataSource {

    override suspend fun test(): Response<TestResponse> {
        return sampleApi.test()
    }
}