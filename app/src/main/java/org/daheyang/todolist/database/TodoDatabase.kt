package org.daheyang.todolist.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.Room.databaseBuilder
import androidx.room.RoomDatabase

@Database(entities = arrayOf(Todo::class), version = 1)
abstract class TodoDatabase : RoomDatabase() {
    abstract fun todoDao(): TodoDao

    companion object
        @Volatile private var instance: TodoDatabase? = null

        //싱글톤?
        fun getDatabase(context: Context): TodoDatabase? {
            if(instance == null){
                synchronized(TodoDatabase::class){
                    instance = databaseBuilder(
                        context.applicationContext,
                        TodoDatabase::class.java,
                        "memo_database"
                    ).build()
                }
            }
            return instance
        }
}
