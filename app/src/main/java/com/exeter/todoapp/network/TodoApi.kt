package com.exeter.todoapp.network

import com.exeter.todoapp.data.TodoResponse
import retrofit2.http.GET

interface TodoApi {
    @GET("todos/")
    suspend fun getTodosFromServer(): TodoResponse




}