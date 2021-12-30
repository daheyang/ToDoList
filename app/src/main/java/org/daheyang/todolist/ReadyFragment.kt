package org.daheyang.todolist

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import org.daheyang.todolist.databinding.FragmentReadyBinding

class ReadyFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        saveInstanceState: Bundle?
    ): View? {
        val binding = FragmentReadyBinding.inflate(inflater, container, false)
        // 리사이클러 뷰에 띄울 임시 데이터
        val datas = mutableListOf<String>()
        datas.add("시작 전")
        datas.add("잠 자기")

        val layoutManager = LinearLayoutManager(activity)
        binding.recyclerviewReady.layoutManager = layoutManager
        val adapter = TodoAdapter(datas)
        binding.recyclerviewReady.adapter = adapter
        return binding.root
    }
}
