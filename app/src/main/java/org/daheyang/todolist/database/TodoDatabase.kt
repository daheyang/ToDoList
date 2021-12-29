package org.daheyang.todolist.database

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = arrayOf(Todo::class), version = 1)
abstract class TodoDatabase : RoomDatabase() {
    abstract fun todoDao(): TodoDao
}