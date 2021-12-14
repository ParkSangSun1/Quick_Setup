package com.pss.data.mapper

import com.pss.data.remote.model.TestResponse

object MainMapper {
    fun mapperMain(response: TestResponse): com.pss.domain.model.TestResponse {
        return com.pss.domain.model.TestResponse(
            sampleRe_1 = response.sampleRe_1,
            sampleRe_2 = response.sampleRe_2
        )
    }
}