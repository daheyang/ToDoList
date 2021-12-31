package org.daheyang.todolist.database

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface TodoDao {
    @Insert
    fun insertTodo(todo: Todo)

    @Delete
    fun deleteTodo(todo: Todo)

    @Query("SELECT * FROM todoTable WHERE (state = 'Ready')")
    fun getTodo(): LiveData<List<Todo>>

    @Query("SELECT * FROM todoTable WHERE (state = 'Main')")
    fun getTodoMain(): LiveData<List<Todo>>

    //ready->main
    @Query("UPDATE todoTable SET state = 'Main' WHERE (state = 'Ready')")
    fun getTodofromRtoM(): LiveData<List<Todo>>

    //main->done
    @Query("UPDATE todoTable SET state = 'Done' WHERE (state = 'Main')")
    fun getTodofromMtoD(): LiveData<List<Todo>>

    @Query("SELECT * FROM todoTable WHERE (state = 'Done')")
    fun getTodoDone(): LiveData<List<Todo>>

}