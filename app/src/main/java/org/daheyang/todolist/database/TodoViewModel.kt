package org.daheyang.todolist.database

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import kotlinx.coroutines.Dispatchers
import org.daheyang.todolist.repository.TodoRepository

class TodoViewModel(application: Application) : AndroidViewModel(application) {
/*
    private val getTodo : LiveData<List<Todo>>
    private val repository : TodoRepository
    private var getTodoMain : LiveData<List<Todo>>
    private var getTodoDone : LiveData<List<Todo>>


    init{
        repository = TodoRepository(application)
        getTodo = repository.getTodo()
        getTodoMain = repository.getTodoMain()
        getTodoDone = repository.getTodoDone()
    }

    fun insertTodo(todo: Todo){
        repository.insertTodo(todo)
    }

    fun deleteUser(todo: Todo){
        repository.deleteTodo(todo)
    }

    fun getTodoMain(): LiveData<List<Todo>>{
        return getTodoMain
    }
*/
}