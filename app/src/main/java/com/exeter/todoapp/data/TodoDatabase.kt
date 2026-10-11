package com.exeter.todoapp.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(version = 1, entities = [TodoEntity::class], exportSchema = false)
abstract class TodoDatabase : RoomDatabase() {
    abstract fun todoDao(): TodoDao
}