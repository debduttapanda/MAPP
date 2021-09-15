package com.debdutta.mapp.domain

import com.debdutta.mapp.domain.model.TodoTask

interface FetchRepository {

    suspend fun getTask(): TodoTask
}