package com.debdutta.mapp

import com.debdutta.mapp.data.remote.api.FetchApi
import com.debdutta.core.domain.FetchRepository
import com.debdutta.core.domain.model.TodoTask
import javax.inject.Inject

class FetchRepositoryImpl @Inject constructor(
    private val api: FetchApi
) : FetchRepository {

    override suspend fun getTask(): TodoTask {
        return api.getTodoTask()
    }
}