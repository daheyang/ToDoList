package org.daheyang.todolist.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface TodoDao {
    @Query("SELECT * FROM todoTable")
    fun getTodo(): LiveData<List<Todo>>

    @Insert
    fun insertTodo(todo: Todo)
}