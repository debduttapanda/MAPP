package com.debdutta.mapp.data.remote.api

import com.debdutta.core.domain.model.TodoTask
import retrofit2.http.GET

interface FetchApi {

    @GET("/todos/1")
    suspend fun getTodoTask(): TodoTask
}