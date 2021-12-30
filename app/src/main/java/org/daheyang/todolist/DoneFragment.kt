package org.daheyang.todolist

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import org.daheyang.todolist.databinding.FragmentDoneBinding

class DoneFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        saveInstanceState: Bundle?
    ): View? {
        val binding = FragmentDoneBinding.inflate(inflater, container, false)
        // 리사이클러 뷰에 띄울 임시 데이터
        val datas = mutableListOf<String>()
        datas.add("과제 제출하기")

        val layoutManager = LinearLayoutManager(activity)
        binding.recyclerviewDone.layoutManager = layoutManager
        val adapter = TodoAdapter(datas)
        binding.recyclerviewDone.adapter = adapter
        return binding.root
    }
}
