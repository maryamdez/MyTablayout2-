package com.example.mytablayout

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class MyViewPager_Adapter(val fragmentActivity: FragmentActivity) :FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int =3

    override fun createFragment(position: Int): Fragment {
        when(position){
            1-> ForFragment()
            2-> InvestmentFragment()
        }
        return NorozFragment()
    }
}