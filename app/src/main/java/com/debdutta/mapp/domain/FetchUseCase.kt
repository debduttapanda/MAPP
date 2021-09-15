package com.debdutta.mapp.domain

import com.debdutta.common.Resource
import com.debdutta.mapp.domain.model.TodoTask
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class FetchUseCase @Inject constructor(private val repository: FetchRepository) {
    operator fun invoke(): Flow<Resource<TodoTask>> = flow {
        emit(Resource.Loading())
        val task = repository.getTask()
        emit(Resource.Success(task))
    }
}