package com.pss.data.repository

import com.pss.data.mapper.MainMapper
import com.pss.data.repository.remote.datasource.MainDataSource
import com.pss.domain.model.TestResponse
import com.pss.domain.repository.MainRepository
import javax.inject.Inject

class MainRepositoryImpl @Inject constructor(
    private val mainDataSource: MainDataSource
    ) : MainRepository {

    override suspend fun test(): TestResponse {
        return MainMapper.mapperMain(mainDataSource.test().body()!!)
    }
}