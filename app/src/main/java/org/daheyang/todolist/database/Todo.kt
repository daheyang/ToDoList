package org.daheyang.todolist.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "todoTable")
data class Todo(
    @PrimaryKey(autoGenerate = true)
    var id : Long?,
    @ColumnInfo(name = "content")
    var contents: String,
    @ColumnInfo(name = "state")
    var state: String
)
