package com.exeter.todoapp.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert
import kotlinx.coroutines.flow.Flow

@Dao
interface TodoDao {
    @Upsert
    suspend fun upsertTodo(todo: TodoEntity)

    @Delete
    suspend fun deleteTodo(todo: TodoEntity)

    @Query("SELECT * FROM todos WHERE completed = :completed")
    fun getFilteredTodos(completed: Boolean): Flow<List<TodoEntity>>

    @Query("SELECT * FROM todos")
    fun getAllTodos(): Flow<List<TodoEntity>>

    @Query("DELETE FROM todos WHERE id = :id")
    suspend fun deleteTodoById(id: Int)

    @Query("DELETE FROM todos")
    suspend fun deleteAll()
}