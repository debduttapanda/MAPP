package com.debdutta.core.domain.model

data class TodoTask(
    val completed: Boolean,
    val id: Int,
    var title: String,
    val userId: Int
)