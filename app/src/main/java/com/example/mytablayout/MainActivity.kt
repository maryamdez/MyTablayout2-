package com.example.mytablayout

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tabLayout: TabLayout = findViewById(R.id.tabLayout)
        val viewpager2: ViewPager2 = findViewById(R.id.viewpager2)

        viewpager2.adapter = MyViewPager_Adapter(this)

        TabLayoutMediator(tabLayout, viewpager2) { tabLayout, position ->
            when (position) {
                0 -> tabLayout.text = "You"

                1 -> tabLayout.text = "Investment"

                2 -> tabLayout.text = "Noroz"
            }

        }.attach()
    }
}