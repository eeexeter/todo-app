package com.exeter.todoapp.data

import androidx.room.Entity
import androidx.room.PrimaryKey

data class TodoDto(
    val id: Int,
    val todo: String,
    val completed: Boolean,
    val userId: Int,
)

data class TodoResponse(
    val todos: List<TodoDto>
)


@Entity(tableName = "todos")
data class TodoEntity(
    @PrimaryKey
    val id: Int,
    val todo: String,
    val completed: Boolean,
    val userId: Int,
)

