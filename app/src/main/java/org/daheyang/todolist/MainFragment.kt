package org.daheyang.todolist

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import org.daheyang.todolist.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        saveInstanceState: Bundle?
    ): View? {
        val binding = FragmentMainBinding.inflate(inflater, container, false)
        // 리사이클러 뷰에 띄울 임시 데이터
        val datas = mutableListOf<String>()
        datas.add("todo List 예시")
        datas.add("지금 제대로 되는걸까아닐까")
        datas.add("안드로이드 파트장님께 백만원 주기")
        datas.add("새해 계획 세우기")

        val layoutManager = LinearLayoutManager(activity)
        binding.recyclerviewMain.layoutManager = layoutManager
        val adapter = TodoAdapter(datas)
        binding.recyclerviewMain.adapter = adapter
        return binding.root
    }
}
