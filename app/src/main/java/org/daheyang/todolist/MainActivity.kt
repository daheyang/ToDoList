package org.daheyang.todolist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewPager: ViewPager2 = findViewById(R.id.viewpager)
        val pagerAdapter = TestAdapter(this)
        val tabs = findViewById<TabLayout>(R.id.tabs)

        viewPager!!.adapter = pagerAdapter
        //TabLayout과 ViewPager 연결
        TabLayoutMediator(tabs, viewPager) { tab, position ->
            tab.text = "TAB ${(position + 1)}"
        }.attach()
    }

    private inner class TestAdapter(fa: FragmentActivity) : FragmentStateAdapter(fa) {
        val numberOfPages = 3
        override fun getItemCount() = numberOfPages

        override fun createFragment(position: Int): Fragment {
            return when (position) {
                0 -> ReadyFragment()
                1 -> MainFragment()
                else -> DoneFragment()
            }
        }
    }
}