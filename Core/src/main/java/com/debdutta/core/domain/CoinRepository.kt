package com.debdutta.core.domain

import com.debdutta.core.domain.model.TodoTask

interface FetchRepository {

    suspend fun getTask(): TodoTask
}