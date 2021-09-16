package com.debdutta.core.domain

import com.debdutta.core.common.Resource
import com.debdutta.core.domain.model.TodoTask
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class FetchUseCase @Inject constructor(private val repository: FetchRepository) {
    operator fun invoke(): Flow<Resource<TodoTask>> = flow {
        emit(Resource.Loading())
        var task = repository.getTask()
        if(task.title.contains("delect"))
        {
            task.title = "Debdutta Panda"
        }
        emit(Resource.Success(task))
    }
}