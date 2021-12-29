package org.daheyang.todolist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TodoAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>(){
    var datas: List<> = listOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_recyclerview_main, parent, false)
        return TodoViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

    }

    override fun getItemCount(): Int =datas.size

    inner class TodoViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val todo_text = view.findViewById<TextView>(R.id.todo_text)

    }
}