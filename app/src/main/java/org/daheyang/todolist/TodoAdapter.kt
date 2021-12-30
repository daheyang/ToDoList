package org.daheyang.todolist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.daheyang.todolist.database.Todo
import org.daheyang.todolist.databinding.ItemRecyclerviewMainBinding


class TodoViewHolder(val binding: ItemRecyclerviewMainBinding):
        RecyclerView.ViewHolder(binding.root)

class TodoAdapter (val datas: MutableList<String>) : RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    // 항목 개수 확인
    override fun getItemCount(): Int = datas.size

    // 각 항목 뷰를 가지는 뷰 홀더를 준비하기 위해 호출
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
            RecyclerView.ViewHolder = TodoViewHolder(ItemRecyclerviewMainBinding.inflate(
        LayoutInflater.from(parent.context), parent, false))

    // 각 항목을 구성하기 위해 호출
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val binding = (holder as TodoViewHolder).binding
        binding.todoText.text = datas[position]
    }
}
