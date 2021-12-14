package com.pss.quick_setup.di

import com.pss.data.remote.api.SampleApi
import com.pss.data.repository.remote.datasource.MainDataSource
import com.pss.data.repository.remote.datasourceImpl.MainDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DataSourceImplModule {

    @Provides
    @Singleton
    fun provideMainDataSource(
        sampleApi: SampleApi
    ) : MainDataSource {
        return MainDataSourceImpl(
            sampleApi
        )
    }
}