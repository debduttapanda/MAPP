package com.debdutta.mapp.domain.model

data class TodoTask(
    val completed: Boolean,
    val id: Int,
    val title: String,
    val userId: Int
)