package com.exeter.todoapp.di

import android.content.Context
import androidx.room.Room
import com.exeter.todoapp.data.TodoDao
import com.exeter.todoapp.data.TodoDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext context: Context): TodoDatabase {
        return Room.databaseBuilder(context, TodoDatabase::class.java, "todo_db").build()
    }

    @Provides
    @Singleton
    fun provideDao(db: TodoDatabase): TodoDao {
        return db.todoDao()
    }

}