package com.pss.data.remote.api

import com.pss.data.remote.model.TestResponse
import retrofit2.Response
import retrofit2.http.GET

interface SampleApi {
    @GET("/sample/test")
    suspend fun test(

    ) : Response<TestResponse>
}